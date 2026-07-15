import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STUDENT ID:");
        int id = sc.nextInt();

        System.out.println("ENTER THE STUDENT NAME:");
        String name = sc.next();

        System.out.println("ETNER THE STUDENT MARK:");
        int mark = sc.nextInt();

        System.out.println("ENTER THE STUDENT GRADE:");
        char ch = sc.next().charAt(0);

        school store = new school(id, name, mark, ch);


        while (true) {

            System.out.println("1. DISPLAY STUDENT:");
            System.out.println("2. UPDATE NAME:");
            System.out.println("3. UPDATE MARK:");
            System.out.println("4. UPDATE GRADE:");
            System.out.println("5. SHOW MARK");
            System.out.println("6. EXIT:");


            System.out.println("ENTER YOUR CHOICE:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    store.display();
                    break;

                case 2:

                    System.out.println("ENTER NAME TO UPDATE");
                    name = sc.next();

                    store.setName(name);
                    break;

                case 3:

                    System.out.println("ENTER MARK TO UPDATE");
                    mark = sc.nextInt();

                    store.setMark(mark);
                    break;

                case 4:

                    System.out.println("ENTER GRADE TO UPGRADE");
                    char grade = sc.next().charAt(0);

                    store.setGrade(grade);
                    break;

                case 5:

                    System.out.println(store.getMark());
                    break;

                case 6:

                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");


            }


        }
    }
}
