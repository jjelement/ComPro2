package sorrawich.self.self2;

public class Armor {
    private String name;
    private int armor;

    public Armor(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armor=" + armor +
                ", name='" + name + '\'' +
                '}';
    }
}
