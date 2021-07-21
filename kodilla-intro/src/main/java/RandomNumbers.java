import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomElements = new int[10];

        int sum=0;
        for (int i=0; i < randomElements.length; i++)
        {
            randomElements[i] = rand.nextInt(31);
            sum += randomElements[i];

            if (sum >= 5000) {
                return;
            }

        }

        System.out.println("Sum = " + sum);
        System.out.println("Minimum Value = " + getMinValue(randomElements));
        System.out.println("Maximum Value = " + getMaxValue(randomElements));

    }
    public static int getMaxValue(int[] randomElements){
        int maxValue = randomElements[0];
        for(int i=1;i<randomElements.length;i++){
            if(randomElements[i] > maxValue){
                maxValue = randomElements[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] randomElements){
        int minValue = randomElements[0];
        for(int i=1;i<randomElements.length;i++){
            if(randomElements[i] < minValue){
                minValue = randomElements[i];
            }
        }
        return minValue;
    }

}