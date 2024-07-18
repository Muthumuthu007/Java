public class array1d {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = {1, 2, 3, 4, 5};
        int c[];
        int i;
        c = new int[10];
        for (i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
        for(int x:b){
            System.out.println(x++ );
        }
    }
}
