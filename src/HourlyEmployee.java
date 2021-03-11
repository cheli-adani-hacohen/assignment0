import java.io.IOException;

/**
 * HourlyEmployee
 * @see Employee
 */
public class HourlyEmployee extends Employee {

    private int hours;//hours
    private float wage;//wage

    /**
     * empty constractor
     */
    public HourlyEmployee() {
        super();
        this.hours=0;
        this.wage=0;
    }

    /**
     *params constractor
     * @param firstName
     * @param lastName
     * @param id
     * @param hours
     * @param wage
     */
    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage){
        super(firstName, lastName, id);
        try {
            setHours(hours);
            setWage(wage);
        }
        catch (IOException m){
            System.out.println(m.getMessage());
        }
    }

    /**
     *
     * @return earning
     */
    @Override
    public float earnings() {
        return (getHours()*getWage());
    }

    /**
     *
     * @return hours
     */
    public int getHours() {
        return hours;
    }

    /**
     *
     * @param hours
     * @throws IOException
     */
    public void setHours(int hours) throws IOException {
        if(hours<=0)
            throw new IOException("Negative hour"+ hours);
        else
            this.hours = hours;
    }

    /**
     *
     * @return wage
     */
    public float getWage() {
        return wage;
    }

    /**
     *
     * @param wage
     * @throws IOException
     */
    public void setWage(float wage) throws IOException{
        if(wage<=0)
            throw new IOException("Negative wage"+ wage);
        else
            this.wage = wage;
    }

    /**
     *
     * @return first name
     */
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    /**
     *
     * @param firstName
     */
    @Override
    public void setFirstName(String firstName){
        super.setFirstName(firstName);
    }

    /**
     *
     * @return last name
     */
    @Override
    public String getLastName() {
        return super.getLastName();
    }

    /**
     *
     * @param lastName
     */
    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    /**
     *
     * @return id
     */
    @Override
    public int getId() {
        return super.getId();
    }

    /**
     *
     * @param id
     */
    @Override
    public void setId(int id) {
        super.setId(id);
    }

    /**
     *
     * @return HourlyEmployee's tostring
     */
    @Override
    public String toString() {
        return "Ex0.HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", hours=" + getHours() +
                ", wage=" + getWage() +
                '}';
    }

    /**
     *
     * @param o
     * @return true if this is same to o, or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return getHours() == that.getHours() && Float.compare(that.getWage(), getWage()) == 0;
    }

}
