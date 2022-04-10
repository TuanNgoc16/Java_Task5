public class Circle_4 {
    float area;
    public float getPI (){
        return 3.14f;
    }
    public void calcArea ( int rad) {
        this.area = this.getPI() * rad * rad;
    }

}
