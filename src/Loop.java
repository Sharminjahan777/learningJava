public class Loop {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while(x<3){
            System.out.println("Inside the Loop");
            System.out.println("The value of x is " + x);
            x = x + 1;
        }
    }
}
