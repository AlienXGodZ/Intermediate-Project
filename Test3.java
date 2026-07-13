import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){

        libraryManagementSystem s = new libraryManagementSystem();

        Scanner sc = new Scanner(System.in);

        s.load();

        while(true){

            System.out.println("1. ADD LIBRARY BOOK:");
            System.out.println("2. SEARCH BOOK NAME:");
            System.out.println("3. UPDATE AUTHOR NAME:");
            System.out.println("4. DISPLAY ALL BOOKS:");
            System.out.println("5. EXIST AUTHOR NAME:");
            System.out.println("6. REMOVE BOOK:");
            System.out.println("7. TOTAL BOOK:");
            System.out.println("8. SORT BY BOOK NAME:");
            System.out.println("9. SORT BY BOOK AUTHOR:");
            System.out.println("10. Save All:");
            System.out.println("11. Exit:");

            System.out.println("ENTER CHOICE:");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ENTER BOOKID:");
                    int bookid = sc.nextInt();

                    System.out.println("ENTER BOOKNAME:");
                    String bookname = sc.next();

                    System.out.println("ENTER BOOKTITLE:");
                    String booktitle = sc.next();

                    System.out.println("ENTER BOOKAUTHOR:");
                    String bookauthor = sc.next();

                    s.add(new library(bookid,bookname,booktitle,bookauthor));

                    break;

                case 2:

                    System.out.println("SEARCH NAME:");
                    bookname = sc.next();

                    s.Search(bookname);

                    break;

                case 3:

                    System.out.println("ENTER BOOKNAME:");
                    bookname = sc.next();

                    System.out.println("UPDATE AUTHOR NAME:");
                    bookauthor = sc.next();

                    s.update(bookname,bookauthor);

                    break;

                case 4:

                    s.display();

                    break;

                case 5:

                    System.out.println("AUTHOR NAME");
                    bookauthor = sc.next();

                    s.exists(bookauthor);

                    break;

                case 6:

                    System.out.println("REMOVE BOOK");
                    bookauthor = sc.next();

                    s.remove(bookauthor);

                    break;

                case 7:

                    s.total();
                    break;

                case 8:

                    s.sortBookName();
                    break;

                case 9:

                    s.sortBookAuthor();
                    break;

                case 10:

                    s.save();
                    break;

                case 11:

                    s.save();

                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");

            }


        }

    }
}
