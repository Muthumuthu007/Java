class triangle{
    private int length;
    private int breadth;
    public triangle(){
        length=1;
        breadth=1;
    }
    public triangle(int l , int b){
        length=l;
        breadth=b;
    }
    public double area() {
        return 0.5 * length * breadth;
    }

}
public class oopconstructor {
    public static void main(String[] args) {
        triangle t=new triangle(3,4);
        System.out.println(t.area());
    }
}
