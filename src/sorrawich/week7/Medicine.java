package sorrawich.week7;

public abstract class Medicine implements  MedicAble {
    private int medicId;
    private String name;
    private String[] ingredients;

    @Override
    public String[] medicIngredients() {
        return this.ingredients;
    }
}
