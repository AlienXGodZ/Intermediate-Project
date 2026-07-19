import java.util.Scanner;

class payment{

    void pay(){

        System.out.println("PROCESSING PAYMENT....");

    }

}

class creditcard extends payment{

     void pay(){

         System.out.println("PAID USING CREDITCAR");

     }

}

class upi extends payment{

    void pay(){

        System.out.println("PAID USING UPI");

    }

}

class paypal extends payment{

    void pay(){

        System.out.println("PAID USING PAYPAL");

    }

}

public class Test18{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1.CREDIT CARD");
            System.out.println("2.UPI");
            System.out.println("3.PAYPAL");
            System.out.println("4.EXIT");

            System.out.println("ENTER YOUR CHOICE:");
            int choice = sc.nextInt();

            switch(choice){

                case 1:

                    payment b = new creditcard();
                    b.pay();

                    break;

                case 2:

                    payment a = new upi();
                    a.pay();

                    break;

                case 3:

                    payment c = new paypal();
                    c.pay();

                    break;

                case 4:

                    System.out.println("THANK YOU");
                    return;


                default:

                    System.out.println("INVALID INDEX");








            }

        }




















    }
}