public class vararg_discount {
    static double discount(double ...x) {
        double a = 0;
        for (double value : x) {
            if (value < 500) {
                a = value* (10.0 / 100);

            } else if (value >= 500 && value<= 1000) {
                a = value* (20.0/ 100);

            } else {
                a = value * (30.0/ 100);
            }

        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(discount(7565));
    }

}
