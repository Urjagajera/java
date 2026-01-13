public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;
        while (n != 0) {
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }
        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
}
