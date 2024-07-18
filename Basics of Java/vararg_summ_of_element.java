public class vararg_summ_of_element {
    static int sum(int ...x){
        int sum=0;
        for(int i=0;i< x.length;i++){
            sum+=x[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5,6,5));

    }
}
