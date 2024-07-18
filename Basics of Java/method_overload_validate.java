public class method_overload_validate {
   static boolean validate(String name){
        return name.matches ("[a=zA-z\\s]+");
    }
   static boolean validate(int age){
        if(age>6 && age<15){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String name1="muthu";
        int age =19;
        System.out.println(validate(name1));
        System.out.println(validate(age));


    }

}
