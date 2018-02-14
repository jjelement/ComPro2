package sorrawich.week5.warmup;

public class UnderGraduatedStudent extends Student {
    private String project;

    public UnderGraduatedStudent(long stdId, String stdName) {
        super(stdId, stdName);
    }

    public UnderGraduatedStudent(long stdId, String stdName, String project) {
        super(stdId, stdName);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "UnderGraduatedStudent{" +
                "project='" + project + '\'' +
                '}';
    }
}
