package sorrawich.week7;

public class Medicine implements MedicAble {
    private int medicId;
    private String name;
    private String[] ingredients;
    String properties = "Medicine Properties";
    private String medicWarning;

    public Medicine() {
    }

    public Medicine(int medicId, String name, String[] ingredients, String properties, String medicWarning) {
        this.medicId = medicId;
        this.name = name;
        this.ingredients = ingredients;
        this.properties = properties;
        this.medicWarning = medicWarning;
    }

    @Override
    public String medicWarning() {
        return medicWarning;
    }

    @Override
    public String medicProperties() {
        return properties;
    }

    @Override
    public String[] medicIngredients() {
        return this.ingredients;
    }

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getMedicWarning() {
        return medicWarning;
    }

    public void setMedicWarning(String medicWarning) {
        this.medicWarning = medicWarning;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
}
