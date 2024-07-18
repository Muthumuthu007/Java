import java.util.Scanner;
public class illl {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2nd number");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m>n)
        {
            System.out.println( m +"is greater than"+ n);

        }
        else {
            System.out.println(n+" is greater than"+ m);
        }


    }
}
