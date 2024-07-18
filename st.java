class stud{
    int rollno;
    String name;
    String dept;
    String subject;
    public stud(int Roll_no,String Name,String de,String sub){
        this.rollno=Roll_no;
        this.name=Name;
        this.dept=de;
        this.subject=sub;
    }
    public int getRoll_no(){
        return rollno;
    }
    public String getName(){
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getSubject() {
        return subject;
    }
    public String setSubject(String su){
        return  subject=su;
    }
    public String toString(){
        return "Roll No "+rollno+" Name "+name+" Department "+dept+" Subject "+subject;
    }
}
public class st{
    public static void main(String[] args){


        stud s1[] =new stud[3] ;
        s1[0]=new stud(192121022,"Muthu","Information Technology","Aptitude");
        s1[1]=new stud(192111697,"Siva","Computer Science ","Aptitude");
        s1[2]=new stud(192121023,"vignesh","Information Technology","Aptitude");
        for(stud s : s1){
            System.out.println(s);
        }


    }
}