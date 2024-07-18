import java.util.Scanner;

public class method_gd {
    static int gcd(int m,int n) {
        while (m != n)
        {
            if(m>n){
                m=m-n;

            }
            else {
                n=n-m;
            }

        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=in.nextInt();
        System.out.println("Enter the Second number:");
        int b=in.nextInt();
        gcd(a,b);
        int n =gcd(a,b);
        System.out.println(n+" is the gcd");

    }
}
