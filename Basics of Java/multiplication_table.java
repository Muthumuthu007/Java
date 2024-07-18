import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the table which you want to print:");
        int n =in.nextInt();
        System.out.println("enter the limit for the table:");
       int b=in.nextInt();
        for(int i=0;i<=b;i++){

            System.out.println(n+"x"+i+"="+n*i);
        }


    }
}
