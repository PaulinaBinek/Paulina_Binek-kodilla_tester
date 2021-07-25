
public class Application {
    String name;
    double age;
    double height;


    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean validAge() {
        this.age = age;
        boolean checkAge;

        if (age > 30) {
            checkAge = true;
            System.out.println("The User is older than 30 or higher than 160.");
        }
        else {
            checkAge = false;
            System.out.println("The User is 30 (or younger) or 160 cm (or shorter)");
        }
        return checkAge;

    }

    public boolean validHeight() {
        this.height = height;
        boolean checkHeight;

        if (height > 160) {
            checkHeight = true;
            System.out.println("The User is older than 30 or higher than 160.");
        }
        else {
            checkHeight = false;
            System.out.println("The User is 30 (or younger) or 160 cm (or shorter)");
        }
        return checkHeight;

    }

    public boolean validName() {
        this.name = name;
        boolean checkName;

        if (name != null) {
            checkName = true;
        }
        else {
            checkName = false;
            System.out.println("Provide User name!");
        }
        return checkName;

    }


    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5, 178);
        adam.validAge();
        adam.validHeight();
        adam.validName();
    }
}

