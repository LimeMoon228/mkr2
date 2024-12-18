class Mage extends Character {
    public Mage(String name, int x, int y) {
        super(name, 100, 40, x, y);
    }

    @Override
    void displayInfo() {
        System.out.println("Mage " + name + " [Health: " + health + ", Attack: " + attackPower + "]");
    }
}