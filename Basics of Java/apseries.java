import java.util.Scanner;

public class apseries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i;
        System.out.println("Enter the Starting number:");
        int a=in.nextInt();
        System.out.println("Enter the common differance:");
        int cd=in.nextInt();
        System.out.println("Enter the number of series");
        int n=in.nextInt();
        int term=a;
        for(i=0;i<n;i++)
        {
            System.out.print(term+",");
            term =term+cd;

        }

    }
}
