class student1{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public int average(){
        return total()/3;
    }
    public char grade(){
        if (average()>=60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
}
public class student {
    public static void main(String[] args) {
        student1 s=new student1();
        s.m1=50;
        s.m2=100;
        s.m3=100;
        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println(s.grade());
    }

}
