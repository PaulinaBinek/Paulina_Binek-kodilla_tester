public class FirstClass {
        public static void main(String[] args) {

            Notebook notebook = new Notebook(200, 1500, 2018);
            System.out.println(notebook.weight + " " + notebook.price);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkPurchase();

            Notebook heavyNotebook = new Notebook(700, 1300, 2000);
            System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkPurchase();

            Notebook oldNotebook = new Notebook(1600,650, 2019);
            System.out.println(oldNotebook.weight + " " + oldNotebook.price);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkPurchase();

        }
    }


