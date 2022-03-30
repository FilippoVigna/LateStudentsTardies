package Project;

public class Student {
     private String lastName;
     private String firstName;
     private int tardies;

    public Student() {
        this.firstName = firstName;
        this.tardies = tardies;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getTardies() {
        return tardies;
    }

    public void setTardies(int tardies) {
        this.tardies = tardies;
    }

    @Override
    public String toString() {
        return "Student:" + lastName +", " + firstName + " " + tardies;
    }
}
