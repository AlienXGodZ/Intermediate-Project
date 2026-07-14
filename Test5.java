import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){

        queuemanagementsystem s = new queuemanagementsystem();

       s.load();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. ADD NAME:");
            System.out.println("2. SERVE PATIENT:");
            System.out.println("3. NEXT PATIENT:");
            System.out.println("4. COUNT PATIENT:");
            System.out.println("5. CHECK EMPTY:");
            System.out.println("6. DISPLAY ALL PATIENT:");
            System.out.println("7. SORT BY NAME:");
            System.out.println("8. EXIT");

            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ENTER NAME:");
                    String name = sc.next();

                    System.out.println("ENTER AGE:");
                    int age = sc.nextInt();

                    s.add(new queue(name,age));

                    break;

                case 2:

                    s.servePatient();
                    break;

                case 3:

                    s.nextPatient();
                    break;

                case 4:

                    s.countPatient();
                    break;


                case 5:

                    s.checkEmpty();
                    break;

                case 6:

                    s.display();
                    break;

                case 7:

                    s.sortname();

                    break;


                case 8:

                    s.save();
                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");

            }

        }













    }
}
