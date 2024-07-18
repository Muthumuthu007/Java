class rectangle{
    private double length ;
    private double breadth;
    public double getLength(){
        return length;

    }
    public double getBreadth(){
        return breadth;

    }
    public void setLength(double l){
        if(l>0){
            length = l;
        }
        else{
            length = 0;
        }
    }
    public void setBreadth(double b){
        if(b>0){
            breadth = b;
        }
        else{
            breadth= 0;
        }
    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}
public class ooptriangle {
    public static void main(String[] args) {
        rectangle t1=new rectangle();
        t1.setBreadth(5.5);
        t1.setLength(10.5);
        System.out.println("Area         :"+t1.area());
        System.out.println("Perimeter    :"+t1.perimeter());
        System.out.println("Is it square :"+t1.isSquare());
        System.out.println(t1.getLength());
        System.out.println(t1.getBreadth());

    }
}
