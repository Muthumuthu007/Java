import java.util.Scanner;

public class count__number {
    public static void main(String[] args) {
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
       while (n>0) {
            n = n / 10;
        count++;
        }
        System.out.println(count);
    }}
