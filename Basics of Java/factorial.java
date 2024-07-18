import java.util.Scanner;
public class factorial {
    public static void main(String [] args){
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the number");
        int fac=1;
        int n=in.nextInt();
        for (int i=1;i<=n;i++){
            fac=(fac*i);
        }
        System.out.println(fac);
    }
}
