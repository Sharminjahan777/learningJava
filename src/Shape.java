public interface Shape {
    public final double pi = 3.1416;
    public double area();
    public double perimeter();
    public default void print(){
        System.out.println("Shape");
    }
    public static void printPI(){
        System.out.println(pi);
    }
}
