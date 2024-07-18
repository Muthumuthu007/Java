import java.util.Scanner;
public class sum_of_integers {
    public static void main(String[] args) {
        int res=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit:");
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
        {
          res=res+i;
        }
        System.out.println(res );
    }
}
