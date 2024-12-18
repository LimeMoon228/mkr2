import java.util.*;

class ArenaMediator {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    private void notifyObservers(Character character) {
        for (Observer observer : observers) {
            observer.update(character);
        }
    }

    public void displayCharacters() {
        System.out.println("Персонажі на арені:");
        for (Character character : characters) {
            character.displayInfo();
        }
    }
}
