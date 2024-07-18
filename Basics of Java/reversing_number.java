import java.util.Scanner;

public class reversing_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");

        int n,r,sum=0;
        n=in.nextInt();
        while(n>0){
           r=n%10;

            sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
