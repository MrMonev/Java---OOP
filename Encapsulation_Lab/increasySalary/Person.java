package increasySalary;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName,int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
    public double getSalary() {
       return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage) {
        if(this.age < 30) {

            this.setSalary(this.getSalary() +
                    (this.getSalary() * percentage / 200));
        } else {
            this.setSalary(this.getSalary() +
                    (this.getSalary() * percentage / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary());
    }
}
