public class Rectangle {
    int width;
    int height;
    Rectangle(){
        System.out.println("Contructor Invoked....");
        width = 10;
        height = 10;
    }
Rectangle(int wid,int heig){
        width= wid;
        height=heig;
}
    void displayDimesions(){
        System.out.println("Width: "+ width);
        System.out.println("Height " + height);
    }
}
