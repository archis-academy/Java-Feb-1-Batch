import java.awt.print.Book;
import java.util.Arrays;
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

    static void extendBooksArrayOnAddition(String title){
        String[] newBooks = new String[books.length + 1];

        for (int i = 0; i < books.length; i++){
            newBooks[i] = Arrays.toString(books[i]);

        }
        newBooks[books.length] = title;
        books = new String[][]{newBooks};
        System.out.println("Kitap Başarıyla eklendi!");

    }


}


    static void truncateBooksArrayOnDeletion(String ISBN) {
        int foundIndex = -1;
        for (int i = 0; i < quantity; i++) {
            if (books[i][2].equals(ISBN)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            System.out.println("Kitap Bulunamadı!");
            return;
        }
        String[][] newBooks = new String[quantity - 1][4];
        for (int i = 0; i < foundIndex; i++) {
            newBooks[i] = books[i];
        }
        for (int i = foundIndex + 1; i < quantity; i++) {
            newBooks[i - 1] = books[i];
        }
        books = newBooks;
        quantity--;

        System.out.println("Kitap başarıyla silindi ve dizi güncellendi.");
    }
}

