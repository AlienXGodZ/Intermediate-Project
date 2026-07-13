import java.util.*;

public class Test2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        EmployeeManagementSystem s = new EmployeeManagementSystem();

        s.loadfile();

        while(true) {
            System.out.println("1. Add Employee:");
            System.out.println("2. Search Employee::");
            System.out.println("3. Update Employee:");
            System.out.println("4. Exist Employee:");
            System.out.println("5. Display Employee:");
            System.out.println("6. Remove Employee:");
            System.out.println("7. Count Employee:");
            System.out.println("8. Sort By EmployeeName:");
            System.out.println("9. Sort By Salary:");
            System.out.println("10. Exit");

            System.out.println("Enter Choice:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("ENTER EMPLOYEE ID:");
                    int id = sc.nextInt();


                    System.out.println("ENTER EMPLOYEE NAME:");
                    String name = sc.next();

                    System.out.println("ENTER EMPLOYEE SALARY");
                    double salary = sc.nextDouble();

                    s.addemploye(new employee(id, name, salary));

                    break;

                case 2:

                    System.out.println("ENTER EMPLOYEE NAME");
                    name = sc.next();
                    s.search(name);

                    break;

                case 3:

                    System.out.println("ENTER EMPLOYEE ID");
                    id = sc.nextInt();

                    System.out.println("ENTER EMPLOYEE NAME");
                    name = sc.next();

                    s.update(id, name);

                    break;

                case 4:

                    System.out.println("ENTER EMPLOYEE NAME");
                    name = sc.next();

                    s.exists(name);

                    break;

                case 5:

                    s.display();
                    break;

                case 6:

                    System.out.println("ENTER EMPLOYEE NAME");
                    name = sc.next();

                    s.remove(name);

                    break;

                case 7:

                    s.count();
                    break;

                case 8:

                    s.sortname();
                    break;

                case 9:

                    s.sortsalary();
                    break;

                case 10:

                    s.savetofile();

                    System.out.println("THANK YOU");

                    return;

                default:

                    System.out.println("INVALID CHOICE");


            }


        }
































    }
}