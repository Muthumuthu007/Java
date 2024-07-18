import java.util.Scanner;
public class sum_of_array {
    public static void main(String [] args){
        int []b=new int[5];
        int n,s;
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length of an array");
        n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+"th element of an array");
            b[i]=in.nextInt();

        }
        System.out.println("enter the element to search:");
        s=in.nextInt();
        for(int i=0;i<b.length;i++){
            if(s==b[i]){
                System.out.println("element found at "+i+"th location");
            }
            else {
                System.out.println("element not found");
            }


            sum=sum+b[i];

        }
        System.out.println("Sum of array"+sum);

    }
}
