import java.util.Scanner;

public class nestedloop {
    public static void main (String [] args){
        int firstnumber,secondnumber,thirdnumber;
        Scanner d= new Scanner (System.in);
        System.out.print("Enter the first number:");
        firstnumber=d.nextByte();
        System.out.println("Enter the second number :");
       secondnumber =d.nextByte();
        System.out.println("Enter the third number :");
        thirdnumber = d.nextByte();
        if (firstnumber>secondnumber&&firstnumber>thirdnumber){
            System.out.println("the first number is greather the number is"+firstnumber);
        }
        else {
            if(secondnumber>thirdnumber){
                System.out.println("Second number is greather the number is "+ secondnumber);
            }
            else if (thirdnumber>secondnumber)
            {
                System.out.println("third number is greather the number is "+thirdnumber);
            }
            else
            {
                System.out.println("secondnumber and thirdnumber are equal");
            }
        }


    }
}
