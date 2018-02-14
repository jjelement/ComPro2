package sorrawich.week5.warmup;

public class GraduatedStudent extends Student {
    private String thesis;

    public GraduatedStudent(long stdId, String stdName) {
        super(stdId, stdName);
    }

    public GraduatedStudent(long stdId, String stdName, String thesis) {
        super(stdId, stdName);
        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "GraduatedStudent{" +
                "thesis='" + thesis + '\'' +
                '}';
    }
}
