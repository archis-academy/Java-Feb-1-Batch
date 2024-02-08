import java.util.Scanner;
public class LibraryManagementSystemApplication {
    static int INDEX = 100;
    static String[][] books = new String[INDEX][4];
    static String[][] patrons = new String[INDEX][4];
    static String[][] transactions = new String[INDEX][3];

    public static void main(String[] args) {
    
    }

     static void addBook(){
        Scanner s = new Scanner(System.in);
        System.out.println("Eklenecek kitabın bilgilerini girin!");
        System.out.println("Başlık:");
        String baslik = s.nextLine();
        System.out.println("Yazar:");
        String yazar = s.nextLine();
        System.out.println("ISBN:");
        String isbn = s.nextLine();
        System.out.println("Miktar:");
        int miktar = s.nextInt(); // string miktar = s.next();

        // kitabı ekleme işlemi
        for(int i = 0;i<INDEX;i++){
            books[i][0] = baslik;
            books[i][1] = yazar;
            books[i][2] = isbn;
            books[i][3] = String.valueOf(miktar); // miktar;
        }
        System.out.println("Kitabı Başarıyla Eklediniz!");
    }
}