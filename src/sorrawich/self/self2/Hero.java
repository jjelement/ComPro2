package sorrawich.self.self2;

public class Hero {
    private String name;
    private int health;
    private Armor armor;
    private Weapon weapon;

    public Hero(String name, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttactPower() {
        return this.weapon.getPower();
    }

    public void attacted(int power) {
        this.health = this.health - (power - this.armor.getArmor());
    }

    public void attacted(Hero enemy) {
        attacted(enemy.getAttactPower());
    }
}
