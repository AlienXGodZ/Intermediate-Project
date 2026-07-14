import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){

        visittracker s = new visittracker();

        Scanner sc = new Scanner(System.in);

        s.load();

        while(true){

            System.out.println("1. ADD VISITOR:");
            System.out.println("2. VISIT EXIST:");
            System.out.println("3. REMOVE VISITOR");
            System.out.println("4. DISPLAY ALL VISITOR:");
            System.out.println("5. COUNT VISITOR:");
            System.out.println("6. IS EMPTY");
            System.out.println("7. REMOVEALL:");
            System.out.println("8. EXIT:");

            System.out.println("ENTER YOUR CHOICE:");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ENTER VISITOR NAME");
                    String name = sc.next();

                    s.add(new visitor(name));
                    break;


                case 2:

                    System.out.println("ENTER THE NAME IS EXIST OR NOT:");
                    name = sc.next();


                    s.visitExist(name);
                    break;

                case 3:

                    System.out.println("ENTER THE NAME TO REMOVE:");
                    name = sc.next();

                    s.remove(name);
                    break;

                case 4:

                    s.display();
                    break;

                case 5:

                    s.countvisitor();
                    break;

                case 6:

                    s.isempty();
                    break;


                case 7:

                    s.removeall();
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
