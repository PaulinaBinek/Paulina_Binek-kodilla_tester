import java.util.Scanner;

public class PickColors {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please type first letter of color");
            String pick = scanner.nextLine().trim().toUpperCase();
            switch (pick) {
                case "B": return "Blue";
                case "W": return "White";
                case "P": return "Pink";
                case "G": return "Green";
                default:
                    System.out.println("No color found");
            }
}}
    public static void main(String[] args) {
        PickColors pickColor = new PickColors();
        String result = pickColor.getUserSelection();
        System.out.println(result);
}

}


