package sorrawich.week7;

public class Paracetamol extends Medicine {
    private int size;
    String properties = "Para Properties";

    public Paracetamol() {
    }

    public Paracetamol(int size, int medicId, String name, String[] ingredients, String properties, String medicWarning) {
        super(medicId, name, ingredients, properties, medicWarning);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String medicProperties() {
        return "Paracetamol: " + super.medicProperties();
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return super.toString() + "Paracetamol{" +
                "size=" + size +
                '}';
    }
}
