public class TestObjectReferences {
    public static void main (String [] args){
        Rectangle objRec1 = new Rectangle(10,20);
        Rectangle objRec2;
        objRec2 =objRec1;
        objRec1 = objRec2;
        System.out.println("\n Rectangle1 Details");
        System.out.println("===================");
        objRec1.displayDimesions();
        System.out.println("\n Rectangle2 Details");
        objRec2.displayDimesions();
    }

}
