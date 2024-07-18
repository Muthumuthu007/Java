public class String_meth {
    static String username(String emil){
        int a=emil.indexOf('@');
        String name=emil.substring(0,a);
        return name;
    }

    public static void main(String[] args) {
        String email="muthu@gmail.com";
       String username = username(email);
        System.out.println("Username: " + username);



    }
}
