package course;

public class Officer extends CrewMember {

    private String rank;


    public Officer(String id, String name, int age, String rank) {
        super(id, name, age);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "rank='" + rank + '\'' +
                '}';
    }
}
