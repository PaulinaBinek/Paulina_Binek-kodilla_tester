
public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook (int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
        public void checkPrice () {
            if (this.price < 600) {
                System.out.println("This notebook is very cheap.");
            } else if (this.price >= 600 && this.price <= 1000) {

                System.out.println("The price is good.");
            } else {
                System.out.println("The price is expensive.");

            }
        }
            public void checkWeight() {
                if (this.weight < 700) {
                    System.out.println("This laptop is light.");
                } else if (this.weight >= 700 && this.weight <= 1200) {

                    System.out.println("The laptop is not so heavy.");
                } else {
                    System.out.println("The laptop is very heavy.");

                } }

                public void checkPurchase() {
                    if (this.year >= 2007 && this.price >= 600) {
                        System.out.println("That's a great bargain");

                    } else if (this.year >= 2011 && this.price <= 1200) {

                        System.out.println("You should consider buying it!");}

                        else
                     {
                        System.out.println("Don't buy it! It's overpriced");

                    }






        } }





