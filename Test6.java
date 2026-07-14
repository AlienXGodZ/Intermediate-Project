import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        websitehistory s = new websitehistory();

        s.load();

        while(true){

            System.out.println("1. ENTER WEBSITE:");
            System.out.println("2. CURRENT WEBSITE:");
            System.out.println("3. COUNT WEBSITE:");
            System.out.println("4. BACK WEBSITE:");
            System.out.println("5. DISPLAY WEBSITE:");
            System.out.println("6. SORT WEBSITE NAME:");
            System.out.println("7. CLEAR WEBSITE:");
            System.out.println("8. TELL IS HISTORY IS EMPTY:");
            System.out.println("9. EXIT:");


            System.out.println("ENTER YOUR CHOICE:");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ENTER THE WEBSITE NAME:");
                    String name = sc.next();

                    s.visitWebsite(new website(name));
                    break;

                case 2:

                    s.currentWebsite();
                    break;

                case 3:

                    s.countHistory();
                    break;

                case 4:

                    s.back();
                    break;

                case 5:

                    s.displayHistory();
                    break;

                case 6:

                    s.sortWebsitename();
                    break;

                case 7:

                    s.clearHistory();
                    break;

                case 8:

                    s.isHistoryEmpty();
                    break;

                case 9:

                    s.save();

                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");






            }







        }

















    }
}