import java.util.Scanner;

public class fibseries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of digits need to print:");
        int n=in.nextInt();
        int fn=-1,sn=1;
        int a=0;
        for(int i=0;i<=n;i++){
            a=fn+sn;
            System.out.print(a);

            fn=sn;
            sn=a;
        }
    }
}
