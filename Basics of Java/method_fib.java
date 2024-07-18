import java.util.Scanner;

public class method_fib {
    static int fib(int x){
        int fn=-1,sn=1;
        int a=0;
        for(int i=0;i<=x;i++){
            a=fn+sn;
            System.out.print(a);

            fn=sn;
            sn=a;
        }
        return a;




    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the limit:");
        int n =in.nextInt();
        fib(n);

  
    }
}
