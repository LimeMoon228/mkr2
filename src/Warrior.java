class Warrior extends Character {
    public Warrior(String name, int x, int y) {
        super(name, 150, 20, x, y);
    }

    @Override
    void displayInfo() {
        System.out.println("Warrior " + name + " [Health: " + health + ", Attack: " + attackPower + "]");
    }
}
