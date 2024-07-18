import java.util.Scanner;

public class typeofwebsites {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the domain Name:");
        String domain =scan.nextLine();
        String domain_ext=domain.substring(domain.lastIndexOf(".")+1);
        switch (domain_ext)
        {
            case "com":
                System.out.println("The given domain is commercial");
                break;
            case "net":
                System.out.println("The given domain is network");
                break;

            case "edu":
                System.out.println("The given domain is education");
                break;

            case "gov":
                System.out.println("The given domain is government");
                break;

        }

    }
}
