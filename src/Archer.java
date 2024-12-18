class Archer extends Character {
    public Archer(String name, int x, int y) {
        super(name, 120, 30, x, y);
    }

    @Override
    void displayInfo() {
        System.out.println("Archer " + name + " [Health: " + health + ", Attack: " + attackPower + "]");
    }
}
