class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String introduce() {
        return "Mam na imię " + firstName + " " + lastName + ", mam " + age + " lat, jestem " + gender + ".";
    }

    public void changeAge(int newAge) {
        this.age = newAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
class Employee extends Person {
    String position;
    String award;
    int ID;
    boolean jobStatus;
    public Employee(String firstName, String lastName, int age, String gender, String position, String award, int ID) {
        super(firstName, lastName, age, gender);
        this.position = position;
        this.award = award;
        this.ID = ID;
        this.jobStatus = false;
    }
    public String getPosition() {
        return position;
    }
    public String getAward() {
        return award;
    }
    public int getID() {
        return ID;
    }
    public boolean getJobStatus() {
        return jobStatus;
    }
    public void setJobStatus(boolean jobStatus) {
        this.jobStatus = jobStatus;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Stachu", "Czarny", 68, "Niebinarny", "Szef", "Samochód", 1);
        System.out.println(employee.introduce());
    }
}