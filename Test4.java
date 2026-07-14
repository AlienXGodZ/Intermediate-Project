import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieCollection s = new MovieCollection();

        s.load();

        while(true){

            System.out.println("1. ADD MOVIENAME: ");
            System.out.println("2. SEARCH MOVIENAME ");
            System.out.println("3, UPDATE RATING ");
            System.out.println("4. MOVIE EXIST: ");
            System.out.println("5. DISPLAY MOVIELIST: ");
            System.out.println("6. COUNT MOVIE:");
            System.out.println("7. SORT BY MOVIENAME: ");
            System.out.println("8. SORT BY MOVIERATING: ");
            System.out.println("9. REMOVE MOVIE:");
            System.out.println("10. SAVE");
            System.out.println("11. EXIT");

            System.out.println("/n ENTER YOUR CHOICE: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1 :

                    System.out.println("ENTER MOVIE ID: ");
                    int id = sc.nextInt();


                    System.out.println("ENTER MOVIE NAME: ");
                    String name = sc.next();

                    System.out.println("ENTER MOVIE RATING: ");
                    double rating = sc.nextDouble();

                    s.addmovie(new movie(id,name,rating));

                    break;

                case 2:

                    System.out.println("TYPE MOVIE NAME I WILL SEARCH: ");
                    name = sc.next();

                    s.search(name);

                    break;

                case 3:

                    System.out.println("TYPE THE MOVIE NAME I WILL UPDATE MOVIE RATING: ");
                    name = sc.next();

                    System.out.println("TYPE THE MOVIE RATING TO UPDATE: ");
                    rating = sc.nextDouble();



                    s.update(name, rating);

                    break;

                case 4:

                    System.out.println("TYPE THE MOVIE NAME I WILL CHECK ITS IS EXIST OR NOT: ");
                    name = sc.next();

                    s.movieExists(name);


                    break;

                case 5:

                    s.display();

                    break;

                case 6:

                    s.countmovie();

                    break;

                case 7:

                    s.sortname();

                    break;

                case 8:

                    s.sortrating();
                    break;

                case 9:

                    System.out.println("ENTER MOVIE ID TO REMOVE");
                    id = sc.nextInt();

                    s.remove(id);
                    break;

                case 10:

                    s.save();
                    break;

                case 11:

                    s.load();
                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");

            }

        }




















    }
}
