public class LibraryManagementSystemApplication {
    static int INDEX = 100;
    static int quantity = 0;
    static String[][] books = new String[INDEX][4];
    static String[][] patrons = new String[INDEX][4];
    static String[][] transactions = new String[INDEX][3];

    public static void main(String[] args) {

    }
    static void addBook(String title, String author, String ISBN, String pageNumber){

         books[quantity][0] = title;
         books[quantity][1] = author;
         books[quantity][2] = ISBN;
         books[quantity][3] = pageNumber;

         quantity++;

        System.out.println("Kitabı Başarıyla Eklediniz!");
    }
}