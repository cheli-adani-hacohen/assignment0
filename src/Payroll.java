/**
 * Assignment 0
 *
 * Mini project in Introd. to Software Engineering
 * 151055
 *
 *  @author Cheli Adani Hacohen
 *  206441479
 *
 * Test of assignment 0
 */
public class Payroll {
    /**
     * Main program of test
     * Try the next classes:
     * @see Employee
     * @see HourlyEmployee
     * @see CommissionEmployee
     * @see BasePlusCommissionEmployee
     *
     * @param args
     */
    public static void main(int[] args) {
        Employee[] array;
        array = new Employee[3];
        array[0] = new HourlyEmployee("Roy", "Cohen", 233322322, 8, 38.5F);
        array[1] = new CommissionEmployee("Efrat", "Levi", 119919119, 21811.32F, 25);
        array[2] = new BasePlusCommissionEmployee("Meni", "Dahan", 123456781, 13432.65F, 24, 5323.32F);

        for (Employee i:array){
            System.out.println("First Name: "+ i.getFirstName()+",");
            System.out.println("Last Name: "+ i.getLastName()+",");
            System.out.println("ID: "+ i.getId()+",");
            System.out.print("Earning: ");
            /**
             * If the worker is BasePlusCommissionEmployee, his salary been grow in 10%.
             */
            if(i instanceof BasePlusCommissionEmployee) {
                System.out.println(i.earnings() * 1.1 +".\n");
            }
            else{
                System.out.println(i.earnings()+".\n");
            }
        }
    }
}
