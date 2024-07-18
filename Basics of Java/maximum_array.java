import java.util.Scanner;

public class maximum_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5],n,temp=0,i,temp2;
        System.out.println("enter the length of an array");
        n=in.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Enter the "+i+"th element of an array");
            a[i]=in.nextInt();

        }
        temp=a[0];
        temp2=a[0];
        for( i=0;i<a.length;i++)
        {
            if(temp<a[i]){
                temp2=temp;
                temp=a[i];
                System.out.println("1st mxt"+temp);
            }
            else if (temp2<a[i]) {
                temp2=a[i];
            }

        }                System.out.println("2nd max"+temp2);

    }
}
