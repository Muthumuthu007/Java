import java.util.Scanner;

public class method_pallindrome {
    static int pall(int x){
        int temp=0,sum=0,res=0;
        temp =x;
        while (x>0){
           sum=x%10;
           res=(res*10)+sum;
           x=x/10;
        }
        if(res==temp){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number to check the palindrome");

        int a=n.nextInt();
       int result= pall(a);
       if(result==1){
           System.out.println(a+" is a palindrome");
       }
       else {
           System.out.println(a+" is not a palindrome");

       }
    }
}
