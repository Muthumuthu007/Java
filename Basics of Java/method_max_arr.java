import java.util.Scanner;

public class method_max_arr {
    static int max(int a[]){
       int temp=0,i;
       for (i=0;i<a.length;i++){
           if(temp<a[i]){
               temp=a[i];
           }
       }
       return temp;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number of element in an array:");
        int n =in.nextInt();
        int a[]=new int[5];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+"th element");
           a[i]=in.nextInt();
        }
        int maximum=max( a);
        System.out.println("max element in an array:"+maximum);
    }
}
