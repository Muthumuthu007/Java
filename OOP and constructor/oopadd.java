class add{
    int a,b;
    public int addition(){
        return a+b;
    }
}

public class oopadd {
    public static void main(String[] args) {
        add a1=new add();
        a1.a=1;
        a1.b=2;
        System.out.println("ADDITION : "+a1.addition());
    }
}
