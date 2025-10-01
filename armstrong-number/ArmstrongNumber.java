public class Armstrong {
    public static void main(String[] args) {
        int num = 153; // Change this to test other numbers
        int original = num, sum = 0, digits = 0;

        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}
