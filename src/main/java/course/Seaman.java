package course;

public class Seaman extends CrewMember {

    private String jobDes;

    public Seaman(String id, String name, int age, String jobDes) {
        super(id, name, age);
        this.jobDes = jobDes;
    }

    public String getJobDes() {
        return jobDes;
    }

    public void setJobDes(String jobDes) {
        this.jobDes = jobDes;
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "jobDes='" + jobDes + '\'' +
                '}';
    }
}
