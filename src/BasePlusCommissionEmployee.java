import java.io.IOException;

/**
 * BasePlusCommissionEmployee extends CommissionEmployee
 *
 * @see CommissionEmployee
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private float baseSalary;//base salary

    /**
     * Constractor
     *
     * @throws IOException
     */
    public BasePlusCommissionEmployee() throws IOException{
        super();
        setBaseSalary(0);
    }

    /**
     * params constractor
     *
     * @param firstName
     * @param lastName
     * @param id
     * @param grossSales
     * @param commision
     * @param baseSalary
     */
    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision, float baseSalary) {
        super(firstName, lastName, id, grossSales, commision);
        try {
            setBaseSalary(baseSalary);
        }
        catch (IOException m){
            System.out.println(m.getMessage());
        }
    }

    /**
     *
     * @return base salary
     */
    public float getBaseSalary() {
        return baseSalary;
    }

    /**
     *
     * @param baseSalary
     * @throws IOException
     */
    public void setBaseSalary(float baseSalary) throws IOException {
        if(baseSalary<0)
            throw new IOException("Negative base salary "+baseSalary);
        this.baseSalary = baseSalary;
    }

    /**
     *
     * @return gross sales
     */
    @Override
    public float getGrossSales() {
        return super.getGrossSales();
    }

    /**
     *
     * @param grossSales
     * @throws IOException
     */
    @Override
    public void setGrossSales(float grossSales) throws IOException{
        super.setGrossSales(grossSales);
    }

    /**
     *
     * @return commision
     */
    @Override
    public int getCommision() {
        return super.getCommision();
    }

    /**
     *
     * @param commision
     * @throws IOException
     */
    @Override
    public void setCommision(int commision) throws IOException{
        super.setCommision(commision);
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
    public void setId(int id){
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
     * @return tostring
     */
    @Override
    public String toString() {
        return "Ex0.BasePlusCommissionEmployee{" +
                "baseSalary=" + getBaseSalary() +
                ", grossSales=" + getGrossSales() +
                ", commision=" + getCommision() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
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
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.getBaseSalary(), getBaseSalary()) == 0;
    }

    /**
     *
     * @return earning
     */
    @Override
    public float earnings() {
        return (super.earnings()+getBaseSalary());
    }
}
