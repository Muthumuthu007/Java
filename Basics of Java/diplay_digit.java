import java.util.Scanner;

public class diplay_digit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        for(int i =0;i<=n;i++){
         int   r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }

}
