public class reverse_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int b[]=new int[10];
        int i,j;
        int n=11;
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println(" ");
        for(i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];

        }
        for(i=0;i<a.length;i++){
            System.out.print(b[i]+",");
        }
    }
}
