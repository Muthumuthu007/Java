public class method_rea {
    static int area(int x,int y){
        int m=x*y;
        return m;

    }
    static float area(float r){
        float a=(float) Math.PI*(r*r);
        return a;


    }

    public static void main(String[] args) {

        System.out.println(area(22.1f));
        System.out.println(area(2,3));
    }

}
