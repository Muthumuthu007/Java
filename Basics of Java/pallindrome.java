import java.util.Scanner;

public class pallindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n, r, sum = 0;
        System.out.println("enter the number");
        n = in.nextInt();
        int temp = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum*10)+r;

            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + "  is a Pallindrome number");
        } else {
            System.out.println(temp + "  is not a Pallindrome number");
        }
    }
}
