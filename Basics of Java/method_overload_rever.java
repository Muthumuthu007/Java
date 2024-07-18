public class method_overload_rever {
    static  int rev(int a){
        int temp=0,sum=0;
        while(a>0){
            temp=a%10;
            sum=(sum*10)+temp;
            a=a/10;
        }
        return sum;
    }
    static int[] rev(int a[]){
        int i,j;
        int b[]=new int[a.length];
        for(i=a.length-1,j=0;i>=0;i--,j++) {
            b[j] = a[i];

        }
        return b;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};

       int c[]=rev(a);
        for(int x:c){
            System.out.println(x);
        }
        System.out.println("---------------------------------------");

        System.out.println(rev(564));

    }
}
