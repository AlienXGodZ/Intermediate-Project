import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){

        TodoList1 s1 = new TodoList1();

        s1.load();

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. ADD NAME TODOLIST:");
            System.out.println("2. ADD NAME TODLIST AT FIRST:");
            System.out.println("3. ADD NAME TODOLIST AT LAST:");
            System.out.println("4. COMPLETE FIRST TASK:");
            System.out.println("5. VIEW FIST TASK:");
            System.out.println("6. VIEW LAST TASK:");
            System.out.println("7. REMOVE LAST TASK:");
            System.out.println("8. DISPLAY ALL TASK:");
            System.out.println("9. COUNT TASK:");
            System.out.println("10. CHECK EMPTY:");
            System.out.println("11. EXIT:");

            System.out.println("ENTER YOUR CHOICE:");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ADD NAME TODOLIST:");
                    String name  = sc.next();

                    s1.add(new TodoList(name));
                    break;

                case 2:

                    System.out.println("ADD NAME TODOLIST AT FIRST:");
                    name  = sc.next();

                    s1.addFirst(new TodoList(name));
                    break;

                case 3:

                    System.out.println("ADD NAME TODOLIST AT LAST:");
                    name  = sc.next();

                    s1.addLast(new TodoList(name));
                    break;

                case 4:

                    s1.completeFirstTask();
                    break;

                case 5:

                    s1.viewFirstTask();
                    break;

                case 6:

                    s1.viewLastTask();
                    break;

                case 7:

                    s1.removeLastTask();
                    break;

                case 8:

                    s1.display();
                    break;

                case 9:

                    s1.count();
                    break;

                case 10:

                    s1.checkEmpty();
                    break;

                case 11:

                    s1.save();
                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("ERROR");

            }
        }
    }
}
