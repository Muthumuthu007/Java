import java.util.Scanner;

public class twostagepipeline {
    public static void main(String[] args){
        int a,b,res=0;
        String choice;
        int fetch=1,execute=1;
        Scanner al= new Scanner(System.in);
        System.out.println("enter the first number:");
        a=al.nextInt();
        System.out.println("enter the Second number number:");
        b=al.nextInt();
        al.nextLine();
        System.out.println("Enter your choices\n 1.Add\n 2.Sub\n 3.mul\n 4.Div ");
        choice = al.nextLine();
        switch (choice){
            case "add":
                res=a+b;
                break;
            case "sub":
                res=a-b;
                break;
            case "mul":
                res=a*b;
                break;
            case "div":
                res=a/b;
                break;
            default:
                System.out.println("invalid");
                break;

        }
        System.out.println("Result :" +  res);
        System.out.println("Total Number of cycle:" + (fetch + execute));


    }
}
