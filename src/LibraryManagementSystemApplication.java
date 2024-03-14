import java.awt.print.Book;
import java.util.Scanner;

public class LibraryManagementSystemApplication {
    static int INDEX = 100;
    static int quantity = 0;
    static String[][] books = new String[INDEX][4];
    static String[][] patrons = new String[INDEX][4];
    static String[][] transactions = new String[INDEX][3];

    public static void main(String[] args) {

    }

    static void addBook(String title, String author, String ISBN, String pageNumber) {

        books[quantity][0] = title;
        books[quantity][1] = author;
        books[quantity][2] = ISBN;
        books[quantity][3] = pageNumber;

        quantity++;

        System.out.println("Kitabı Başarıyla Eklediniz!");
    }

    static void requestBook(String title, String author) {
        int pageNumber = randomPage();
        int ISBN = randomISBN();
        System.out.println("Kitap talebiniz tarafımızca alındı!");
        System.out.println("Kitap Adı:" + title);
        System.out.println("Yazar Adı:" + author);
        System.out.println("Kitap Sayfa Sayısı:" + pageNumber);
        System.out.println("Kitap ISBN:" + ISBN);


    }
}


