class ArenaObserver implements Observer {

    @Override
    public void update(Character character) {
        System.out.println("Новий персонаж на арені: " + character.name);
    }
}