class cylinder{
    public double radius ;
    public double height;
    public double lidarea(){
        return Math.PI*radius*radius;

    }
    public double totalsurface(){
        return 2*lidarea()+circumference()*height;
    }
    public double volume()
    {
        return lidarea()*height;

    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
public class oopcylinder {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.height=10;
        c.radius=7;
        System.out.println("Lid area         "+c.lidarea());
        System.out.println("total surface    "+c.totalsurface());
        System.out.println("Volume           "+c.volume());
        System.out.println("circumference    "+c.circumference());
    }

}
