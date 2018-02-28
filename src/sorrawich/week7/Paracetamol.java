package sorrawich.week7;

public class Paracetamol extends Medicine {
    private int size;
    private String properties;
    private String medicWarning;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String medicProperties() {
        return properties;
    }

    @Override
    public String medicWarning() {
        return medicWarning;
    }
}
