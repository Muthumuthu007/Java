class substraction {
    int a,b;
    public int sub(){
        return a-b;
    }
}



public class sub {
    public static void main(String[] args) {
        substraction s1=new substraction();
        s1.a=4;
        s1.b=7;
        System.out.println("SUb"+s1.sub());
    }
}
