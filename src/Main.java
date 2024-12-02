public class Main {
    public static void main(String[] args) {
        System.out.println("No Argument");
        TestProgram t1= new TestProgram();
        System.out.println("AREA IS: "+t1.getArea());
        System.out.println("PERIMETER IS: "+t1.getPerimeter());
        System.out.println("2 Argument");
        TestProgram t2= new TestProgram(6,4);
        System.out.println("AREA IS: "+t2.getArea());
        System.out.println("PERIMETER IS: "+t2.getPerimeter());
        System.out.println("ALL ArgumentS");
        TestProgram t3= new TestProgram(10,4,5.6,7.8);
        System.out.println("AREA IS: "+t3.getArea());
        System.out.println("PERIMETER IS: "+t3.getPerimeter());

    }
}