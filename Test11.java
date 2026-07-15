import java.util.Scanner;

public class Test11{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR EMPLOYEE ID:");
        int id = sc.nextInt();

        System.out.println("ENTER YOUR EMPLOYEE NAME:");
        String name = sc.next();

        System.out.println("ENTER YOUR EMPLOYEE SALARY:");
        double salary = sc.nextDouble();

        System.out.println("ENTER YOUR EMPLOYEE DEPARTMENT NAME:");
        String department = sc.next();


        employe employees = new employe(id,name,salary,department);

        while(true){

            System.out.println("1. DISPLAY EMPLOYEE");
            System.out.println("2. UPDATE NAME");
            System.out.println("3. UPDATE SALARY");
            System.out.println("4. UPDATE DEPARTMENT");
            System.out.println("5. SHOW SALARY");
            System.out.println("6. EXIT");

            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    employees.display();
                    break;

                case 2:

                    System.out.println("ENTER EMPLOYEE NAME TO UDPATE:");
                    name = sc.next();

                    employees.setName(name);
                    break;

                case 3:

                    System.out.println("ENTER EMPLOYEE SALARY TO UPDATE");
                    salary = sc.nextDouble();

                    employees.setSalary(salary);
                    break;

                case 4:

                    System.out.println("ENTER EMPLOYEE DEPARTMENT NAME TO UPDATE");
                    department = sc.next();

                    employees.setDepartment(department);
                    break;

                case 5:

                    System.out.println("CURRENT SALARY:" + employees.getSalary());
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