 public class TestCustomer {
public static void main ( String [] args){
    Customer objCustomer = new Customer ();



    objCustomer.customerID=100;
    objCustomer.customerName="Jack";
    objCustomer.customerAddress="123Street";
    objCustomer.customerAge = 30;
    objCustomer.displayCustomerInformation ();
    objCustomer.changeCustomerAddress("123Fort, MainStreet");
    objCustomer.displayCustomerInformation ();
}




 }
