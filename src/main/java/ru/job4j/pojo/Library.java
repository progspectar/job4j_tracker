package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 100);
        Book book2 = new Book("Book2", 200);
        Book book3 = new Book("Book3", 300);
        Book bookCC = new Book("Clean Code", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = bookCC;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumber());
        }
        System.out.println("Swap Book1 and Clean Code.");
        books[0] = bookCC;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getNumber());
        }
        System.out.println("Shown only books \"Clean Code\" ");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals(bookCC.getName())) {
                System.out.println(bk.getName() + " - " + bk.getNumber());
            }
        }
    }
}
