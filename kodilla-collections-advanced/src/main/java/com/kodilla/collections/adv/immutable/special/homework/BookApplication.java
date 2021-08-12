package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.createBook("Call of Cthulhu", "H.P Lovecraft");
        BookManager.createBook("Dracula", "B. Stoker");
        System.out.println(BookManager.createBook("Call of Cthulhu", "H.P Lovecraft").hashCode());
        System.out.println(BookManager.createBook("Call of Cthulhu", "H.P Lovecraft").hashCode());
        System.out.println(BookManager.createBook("Call of Cthulhu", "H.P Lovecraft").equals(BookManager.createBook("Call of Cthulhu", "H.P Lovecraft")));
    }
}
