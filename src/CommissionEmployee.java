import java.io.IOException;
/**
 * CommissionEmployee class
 *
 * @see Employee
 */
public class CommissionEmployee extends Employee {

    private float grossSales;// gross sales
    private int commision;// commision

    /**
     *
     * empty constractor
     */
    public CommissionEmployee() {
        super();
        grossSales = 0;
        commision = 0;
    }

    /**
     * params constractor
     *
     * @param firstName
     * @param lastName
     * @param id
     * @param grossSales
     * @param commision
     */
    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        try {
            setGrossSales(grossSales);
            setCommision(commision);
        } catch (IOException m) {
            System.out.println(m.getMessage());
        }
    }

    /**
     *
     * @return grossSeles
     */
    public float getGrossSales() {
        return grossSales;
    }

    /**
     *
     * @param grossSales
     * @throws IOException
     */
    public void setGrossSales(float grossSales) throws IOException {
        if (grossSales < 0)
            throw new IOException("Negative gross sales" + grossSales);
        else
            this.grossSales = grossSales;
    }

    /**
     *
     * @return commision
     */
    public int getCommision() {
        return commision;
    }

    /**
     *
     * @param commision
     * @throws IOException
     */
    public void setCommision(int commision) throws IOException {
        if (commision < 0)
            throw new IOException("Negative commision" + commision);
        else
            this.commision = commision;
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
    public void setFirstName(String firstName) {
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
     * @return toString
     */
    @Override
    public String toString() {
        return "Ex0.CommissionEmployee{" +
                "grossSales=" + getGrossSales() +
                ", commision=" + getCommision() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                '}';
    }

    /**
     *
     * @param o
     * @return true if this is same to o, or false/
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.getGrossSales(), getGrossSales()) == 0 && getCommision() == that.getCommision();
    }

    /**
     *
     * @return earning
     */
    @Override
    public float earnings() {
        return ((float) (getCommision() / 100) * getGrossSales());
    }
}
