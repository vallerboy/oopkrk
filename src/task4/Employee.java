package task4;

public class Employee {
    private String name;
    private String lastname;
    private int birthdayYear;
    private int seniority;

    public Employee(String name, String lastname, int birthdayYear, int seniority) {
        this.name = name;
        this.lastname = lastname;
        this.birthdayYear = birthdayYear;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdayYear=" + birthdayYear +
                ", seniority=" + seniority +
                '}';
    }
}
