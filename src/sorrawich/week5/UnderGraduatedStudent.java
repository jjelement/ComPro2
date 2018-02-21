package sorrawich.week5;

public class UnderGraduatedStudent extends Student {
    private String project;

    public UnderGraduatedStudent() {
        System.out.println("UnderGraduated Constructor working");
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
        return super.toString() + "UnderGraduatedStudent{" +
                "project='" + project + '\'' +
                '}';
    }
}
