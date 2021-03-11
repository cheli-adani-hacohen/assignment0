/**
 * abstract class Employee
 */
public abstract class Employee {
    private String firstName;//worker's first name
    private String lastName;//worker's last name
    private int id;//worker's id

    /**
     * create nonless worker
     */
    public Employee() {
        firstName="plony";
        lastName="almony";
        id=0;
    }

    /**
     * constractor
     *
     * @param firstName
     * @param lastName
     * @param id
     */
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return toString of Employee
     */
    @Override
    public String toString() {
        return "Ex0.Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                '}';
    }

    /**
     *
     * @param o
     * @return if two object is eguals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }


    /**
     * abstract func
     *
     * @return worker's salary.
     */
    public abstract float earnings();
}

