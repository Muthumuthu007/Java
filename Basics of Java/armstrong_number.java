import java.util.Scanner;

public class armstrong_number {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int i,n,r,sum=0;
        System.out.println("enter the number");
        n= in.nextInt ();
        int temp=0;
        temp=n;
        while(n>0){
            r=n%10;
            sum =sum+(r*r*r);

            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp  +"  is a armstrong number");
        }
        else {
            System.out.println(temp+"  is not a armstrong number");
        }

    }
}
