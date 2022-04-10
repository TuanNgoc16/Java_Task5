public class Varasgs {
    public void addNumber ( int...num){
        int sum=0;
        for ( int i: num){
            sum = sum + i;
        }
        System.out.println("Sum of number is: " + sum);
    }
    public static void main (String[] args ){
        Varasgs obj = new Varasgs();
        obj.addNumber(10,20,30,40);
    }
}
