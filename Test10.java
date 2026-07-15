import java.util.Scanner;

public class Test10{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ACCOUNT NUMBER:");
        int number = sc.nextInt();

        System.out.println("ENTER ACCOUNT NAME:");
        String name = sc.next();

        System.out.println("ENTER INITIAL BALANCE:");
        double balance = sc.nextDouble();

        bankaccount account = new bankaccount(number,name,balance);

        while(true){

            System.out.println("\n------------BANK MENU------------");
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. UPDATE ACCOUNT HOLDER");
            System.out.println("5. UPDATE ACCOUNT NUMBER");
            System.out.println("6. DISPLAY ACCOUNT");
            System.out.println("7. EXIT");

            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ENTER AMOUNT:");
                    int amount = sc.nextInt();

                    account.deposit(amount);
                    break;

                case 2:

                    System.out.println("ENTER AMOUNT:");
                    amount = sc.nextInt();

                    account.withdraw(amount);
                    break;


                case 3:

                    System.out.println("CURRENT BALANCE:" + account.getBalance());
                    break;

                case 4:

                    System.out.println("ENTER ACCOUNTNAME TO UDPATE");
                    name = sc.next();

                    account.setAccountholder(name);
                    break;

                case 5:

                    System.out.println("ENTER ACCOUNTNUMBER TO UDPATE");
                    number = sc.nextInt();

                    account.setAccountnumber(number);
                    break;

                case 6:

                    account.display();
                    break;

                case 7:

                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");





            }






        }





    }
}