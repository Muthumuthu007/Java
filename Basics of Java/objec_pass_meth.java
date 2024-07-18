public class objec_pass_meth {
    static void up(int a[]){
        a[0]=25;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        up(a);
        System.out.println(a[0]);

    }
}
