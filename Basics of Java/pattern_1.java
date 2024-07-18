public class pattern_1 {
    public static void main(String[] args) {
        int i,j=1,count=0;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                ++ count;
                System.out.format("%02d ",count);
            }

            System.out.println(" ");
        }
    }
}
