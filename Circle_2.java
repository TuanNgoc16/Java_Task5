// Session 4
public class Circle_2 {
    public double getPI() {
        return 3.14;
    }
}
 class passByRef {
    public void calculate(Circle_2 objPi, double rad) {
        double area = objPi.getPI() * rad * rad;
        System.out.println("Area of the circle is " + area);
    }

    public static void main(String[] args) {
        passByRef p1 = new passByRef();
        p1.calculate(new Circle_2(), 2);
    }
}
