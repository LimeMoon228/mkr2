class CharacterFactory {
    public static Character createCharacter(CharacterType type, String name, int x, int y) {
        switch (type) {
            case WARRIOR:
                return new Warrior(name, x, y);
            case MAGE:
                return new Mage(name, x, y);
            case ARCHER:
                return new Archer(name, x, y);
            default:
                return null;
        }
    }
}