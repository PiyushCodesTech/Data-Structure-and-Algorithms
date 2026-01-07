public class calculatePower {
    public static int power(int base, int pow){
        if(pow == 1){
            return base;
        }
        // If the power is even
        int res = power(base, pow/2) * power(base, pow/2);

        if(pow % 2 != 0){
            res = res * base;
        }
        return res;
    }

    static void main(String[] args) {
        int base = 2;
        int pow = 5;

        System.out.println(power(base, pow));
    }
}
