class subject1{
    String sub_id;
    String name;
    int Max_mark;
    int mark_obt;
    public subject1(String sub,String nam,int max,int obt){
        sub_id=sub;
        name=nam;
        Max_mark=max;
        mark_obt=obt;
    }
    public String GetSub_id()
    {
        return sub_id;
    }
    public String Get_name(){
        return name;
    }
    public int GetMax_maks(){
        return Max_mark;
    }
    public int Getmark_obt(){
        return  mark_obt;
    }
    public void SetMax_marks(int Marksmax){
        Max_mark=Marksmax;
    }
    public void Setmark_obt(int markobt){
       mark_obt= markobt;
    }
}

public class subject {
    public static void main(String[] args) {
        subject1 s1=new subject1("UBA3027","Aptitude",100,65);
        System.out.println("Subject Code " +s1.GetSub_id());
        System.out.println("Subject name "+s1.Get_name());
        System.out.println("Maximum marks "+s1.GetMax_maks());
        System.out.println("Marks obtained "+s1.Getmark_obt());

        s1.SetMax_marks(200);
        s1.Setmark_obt(34);
        System.out.println("-----------------------------------------");
        System.out.println("Updated maximum mark "+s1.GetMax_maks());
        System.out.println("Updated marks obtained "+s1.Getmark_obt());

    }
}
