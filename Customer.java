public class Customer {
   //Customer objCustomer = newCustomer ();
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void changeCustomerAddress (String address){
        customerAddress = address;
    }
    void displayCustomerInformation (){
        System.out.println("CustomerIdentification Number " + customerID);
        System.out.println("Customer Number " + customerName);
        System.out.println("CustomerAddress " + customerAddress);
        System.out.println("CustomerAge " + customerAge);
    }
}
