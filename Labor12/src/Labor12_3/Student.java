package Labor12_3;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double rom;
    private double hun;
    private double math;
    private double average;


    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double average(){
        return (rom+math+hun)/3;
    }
    public boolean passed(){
        if(average()>=6 && rom>=5 && math>=5 && hun>=5){
            return true;
        }
        return false;
    }

    public void setRom(double rom) {
        this.rom = rom;
    }

    public void setHun(double hun) {
        this.hun = hun;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getRom() {
        return rom;
    }

    public double getHun() {
        return hun;
    }

    public double getMath() {
        return math;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int compareTo(Student other) {
        if (this.lastName.equals(other.lastName)) {
            return this.firstName.compareTo(other.firstName);
        }
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rom=" + rom +
                ", hun=" + hun +
                ", math=" + math +
                '}';
    }
}
