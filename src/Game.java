public class Game {
    public static void main(String[] args) {
        ArenaMediator arena = new ArenaMediator();
        Observer observer = new ArenaObserver();
        arena.addObserver(observer);

        Character warrior = CharacterFactory.createCharacter(CharacterType.WARRIOR, "Торін", 10, 20);
        Character mage = CharacterFactory.createCharacter(CharacterType.MAGE, "Мерлин", 15, 25);
        Character archer = CharacterFactory.createCharacter(CharacterType.ARCHER, "Леголас", 5, 30);

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.displayCharacters();
    }
}