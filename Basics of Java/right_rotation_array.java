public class right_rotation_array {

        public static void main(String[] args) {
            int a[]={10,20,30,40,50,60,70,80,90};
            int i,temp;
            temp=a[0];
            for(int x:a) {
                System.out.print(x+",");
            }
            System.out.println(" ");
            for (i=a.length-1;i>0;i--){
                a[i-1]=a[i];

            }
            a[a.length-1]=temp;

            for(int x:a) {
                System.out.print(x+",");
            }
        }
    }

