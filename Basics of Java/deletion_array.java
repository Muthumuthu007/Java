public class deletion_array {

        public static void main(String[] args) {
            int a[]=new int[10];
            a[0]=0;
            a[1]=34;
            a[2]=14;
            a[3]=11;
            a[4]=15;
            a[5]=165;
            a[6]=132;
            int i;
            int index=2,x=5,n=7;
            for(i=0;i<n;i++){
                System.out.print(a[i]+",");


            }
            System.out.println(" ");
            for (i = index; i < n - 1; i++) {
                a[i] = a[i + 1];
            }       n--;
            for(i=0;i<n;i++){
                System.out.print(a[i]+",");

            }

        }


}
