import java.util.Scanner;

public class method_prime {
  /*  static void  prime(int x){
        for(int i=2;i<=x/2;i++){
            if(x%i==0 ){
                System.out.println(x+" is not prime number");
                break;
            }
            else {
                System.out.println(x+" is  a prime number");
                break;
            }
        }

    }

    public static void main(String[] args) {
        int a=91 ;
        prime(a);
    }
}*/
    static Boolean isprime(int x){
        for(int i=2;i<=x/2;i++){
           if(x%i==0){
                return false;
            }
        }

            return true;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n =in.nextInt();
       if(isprime(n)){
           System.out.println(n+" is prime number");
       }
       else {
           System.out.println(n+" is not a prime number ");
       }


    }
}
