import java.awt.print.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Hello library");

        ArrayList<Book> bookList = new ArrayList<Book>();
        int bookAmount= 5;

        for (int i = 0; i < 5; i++) {
            System.out.println("Name: ");
            String name = myScan.nextLine();
            System.out.println("Author: ");
            String auth = myScan.nextLine();
            System.out.println("Pages:" );
            int pages = Integer.parseInt(myScan.nextLine());
            Book myBook = new Book(name, auth, pages);
            bookList.add(mybook);

        }

        for (int i = 0; i < bookList; i++) {

        }

        public exampleArrayList(){

            String[] stringArray= new String[100];

            ArrayList<String> strArrList = new ArrayList<String>();

            strArrList.add(str1);
            strArrList.add("world");
            strArrList.add("example");

            System.out.println("The ArrayList is " + strArrList.size());

            for (int i=0; 1< strArrList.Size(); i++){
                System.out.println(strArrLIst.get(i));
            }
        }
    }

}