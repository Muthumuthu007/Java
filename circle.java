class cir{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;

      }
    public double perimeter(){
        return 2*Math.PI*radius;

    }
    public double circumferences(){
        return perimeter();
    }

}

public class circle {
    public static void main(String[] args) {

        cir c1=new cir();
        c1.radius=7;
        System.out.println("Area "+c1.area());
        System.out.println("Perimeter "+c1.perimeter());
        System.out.println("circumferences "+c1.circumferences());

    }
}
