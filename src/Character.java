abstract class Character {
    String name;
    int health;
    int attackPower;
    int x, y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    abstract void displayInfo();
}