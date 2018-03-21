package sorrawich.week5.models;

public class Student {
    private long stdId;
    private String stdName;

    public Student() {
        System.out.println("Student Constructor working");
    }

    public Student(long stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Student) {
            Student temp = (Student) obj;
            return temp.stdId == this.stdId;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                '}';
    }
}
