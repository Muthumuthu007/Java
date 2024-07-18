class cylinder1{
    double radius;
    double height;
    public cylinder1(){
        radius=1;
        height=1;
    }
    public cylinder1(double r , double h){
        radius=r;
        height=h;
    }

    public double getHeight(){
        return  height ;
    }
    public double getRadius(){
        return  radius ;
    }
    public void setHeight(double h){
        if(h<=0){
             height=0;
        }
        else {
             height=h;
        }


    }public void setRadius(double r){
        if (r<=0){
             radius=0;
        }
        else{
               radius=r;
        }
    }
    public double lid(){
        return  Math.PI*radius*radius;
    }
    public double total_surface(){
        return 2+Math.PI*radius*height;
    }

}
public class oppcylinder_full {
    public static void main(String[] args) {
        cylinder1 c1= new cylinder1();
        c1.setHeight(3);
        c1.setRadius(4);
        System.out.println("LID "+c1.lid());
        System.out.println("total surface"+c1.total_surface());
    }
}
