public class Employee_2 {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;

    public Employee_2 (int ID, String Name){
        empID = ID;
        empName = Name;
    }
    public String getSSN ( ) {
        return SSN;
    }
    public void setSSN (String ssn) {
        SSN = ssn;
    }
    public void setDesignation (String desig){
        empDesig = desig;
    }
    public void display () {
        System.out.println("Employee ID is " + empID);
        System.out.println("Employee Name is " + empName);
        System.out.println("Designation is " + empDesig);
        System.out.println("SSN is " + SSN);
    }
    public static void main (String [] args) {
        Employee objEmpl = new Employee(1200,"Roger Stevens");
        objEmpl.empDesig = "Manager";
        objEmpl.SSN = "281 - 72 - 3873";
objEmpl.dislay();
    }
}
