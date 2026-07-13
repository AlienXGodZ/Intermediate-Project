import java.util.Scanner;

public class Test1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        studentservice s = new studentservice();

        s.loadfromfile();

        while(true){
            System.out.println("\n=======Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Seach Student");
            System.out.println("3. Update Name");
            System.out.println("4. Update Mark");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Student");
            System.out.println("7. Count Display");
            System.out.println("8. Save to File");
            System.out.println("9. Exit");

            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter ID:");
                    int id =  sc.nextInt();

                    System.out.println("Enter Name:");
                    String name = sc.next();

                    System.out.println("Enter Mark:");
                    int mark = sc.nextInt();

                    s.addStudent(id,name,mark);

                    break;


                case 2:
                    System.out.println("Enter ID:");
                    id = sc.nextInt();

                    s.searchStudent(id);

                    break;

                case 3:

                    System.out.println("Enter ID:");
                    id = sc.nextInt();

                    System.out.println("Enter Name to Update:");
                    name = sc.next();

                    s.updatename(id,name);
                    break;

                case 4:

                    System.out.println("Enter ID:");
                    id = sc.nextInt();

                    System.out.println("Enter Mark to Update:");
                    mark = sc.nextInt();

                    s.updateMark(id,mark);
                    break;

                case 5:

                    System.out.println("Enter ID:");
                    id = sc.nextInt();

                    s.deleteStudent(id);
                    break;

                case 6:

                    s.displayStudent();
                    break;


                    case 7:

                        s.countStudent();
                        break;


                case 8:

                    s.saveToFile();
                    break;

                case 9:

                    s.saveToFile();

                    System.out.println("Thank You");

                    return;

                default:

                    System.out.println("INVALID CHOICE");

            }


        }



    }
}