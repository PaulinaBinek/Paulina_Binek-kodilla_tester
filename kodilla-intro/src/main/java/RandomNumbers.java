import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int numbers = 300;
        int min = rand.nextInt(31);
        int max = min;
        sum = sum + max;

        for (int i = 0; i < numbers; i++) {
            int random = rand.nextInt(31);
            sum = sum + random;

            if (max < random) max = random;
            if(random < min) min = random;

            if (sum >= 5000) {
                return;
            }

            System.out.println("Random number is: " + random);
            System.out.println("Max value is: " + max);
            System.out.println("Min value is: " + min);
            System.out.println("The Sum is: " + sum);

        }}}