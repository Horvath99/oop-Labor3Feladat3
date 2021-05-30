package Labor10_2;

public class Student {
    private String NeptunId;
    private String firstname;
    private String lastname;
    private int credits;
    private MyDate birthday;

    public Student(String neptunId, String firstname, String lastname, int credits, MyDate birthday) {
        NeptunId = neptunId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.credits = credits;
        this.birthday = birthday;
    }

    public String getNeptunId() {
        return NeptunId;
    }

    public void setNeptunId(String neptunId) {
        NeptunId = neptunId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NeptunId='" + NeptunId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", credits=" + credits +
                ", birthday=" + birthday +
                '}';
    }
}
