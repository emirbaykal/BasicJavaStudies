import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer customer =new Customer(1, "Emir", "Baykal");
        customers.add(customer);

        for (Customer ref:customers){
            System.out.println(customer.firstName);
        }
    }
}