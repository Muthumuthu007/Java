public class meth_obj {
    static void up(int a[], int index,int value){
        a[index]=value;

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        up(a,2,20);
        for(int x:a)
        {
            System.out.println(x);
        }

    }
}
