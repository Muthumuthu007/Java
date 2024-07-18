public class vararg_nax {
    static int max(int ...x){
        if(x.length==0)
        {
            return Integer.MIN_VALUE;

        }
        int max=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(1,2,3));
        System.out.println(max(4,3,56,2));
        System.out.println(max(56,765,868,65));


    }
}
