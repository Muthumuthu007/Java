import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        int i;

        for (i = 0; i < a.length; i++) {
            System.out.println("Enter the " + i + "th element:");
            a[i] = in.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
