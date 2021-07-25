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
        boolean checkAge;

        if (age > 30) {
            checkAge = true;
        }
        else {
            checkAge = false;
        }
        return checkAge;

    }

    public boolean validHeight() {
        boolean checkHeight;

        if (height > 160) {
            checkHeight = true;
        }
        else {
            checkHeight = false;
        }
        return checkHeight;

    }

    public boolean validName() {
        boolean checkName;

        if (name != null) {
            checkName = true;
        }
        else {
            checkName = false;
        }
        return checkName;

    }

    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5, 178);

        if (adam.validName()) {
            if (adam.validAge() && adam.validHeight()) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }}

