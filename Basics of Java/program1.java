import java.util.Scanner;

public class program1 {
    public static void main(String [] args){
        Scanner a = new Scanner(System.in);
        System.out.println("enter a number:");
        int b = a.nextByte();
        if (b%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }

}