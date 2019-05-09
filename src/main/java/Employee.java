
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    };

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    public int raiseSalary(int percent) {
        salary = salary * percent / 100 + salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee" + "[id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee right = (Employee) obj;
        return id == right.id &&
                salary == right.salary &&
                firstName.equals(right.firstName) &&
                lastName.equals(right.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + id;
        result = 37 * result + salary;
        result = 37 * result + (firstName == null ? 0 : firstName.hashCode());
        result = 37 * result + (lastName == null ? 0 : lastName.hashCode());
        return result;
    }
}
