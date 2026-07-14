import java.util.Scanner;

public class Test9 {
    public static void main(String[] args){


        productcatalog1 s1 = new productcatalog1();

        s1.load();

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. ADD PRODUCT:");
            System.out.println("2. SEARCH PRODUCT BY NAME:");
            System.out.println("3. UPDATE PRODUCT NAME :");
            System.out.println("4. REMOVE PRODUCT BY NAME:");
            System.out.println("5. PRODUCT EXIST:");
            System.out.println("6. REMOVE BY ID:");
            System.out.println("7. COUNT THE PRODUCT:");
            System.out.println("8. UPDATE PRODUCT PRICE:");
            System.out.println("9. DISPLAY ALL PRODUCT:");
            System.out.println("10. SEARCH PRODUCT BY NAME:");
            System.out.println("11. EXIT:");

            System.out.println("ENTER YOUR CHOICE:");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("ENTER PRODUCT ID:");
                    int id = sc.nextInt();

                    System.out.println("ENTER PRODUCT NAME:");
                    String name = sc.next();

                    System.out.println("ENTER PRODUCT PRICE:");
                    double price = sc.nextDouble();

                    s1.add(id, new productcatalog(name, price));

                    break;

                case 2:

                    System.out.println("ENTER PRODUCT NAME TO SEARCH:");
                    name = sc.next();


                    s1.search(name);
                    break;

                case 3:

                    System.out.println("ENTER PRODUCT ID");
                    id = sc.nextInt();

                    System.out.println("ENTER PRODUCT NAME TO UPDATE:");
                    name = sc.next();

                    s1.updateProductName(id, name);
                    break;

                case 4:

                    System.out.println("ENTER PRODUCT NAME TO REMOVE:");
                    name = sc.next();


                    s1.removebyname(name);
                    break;

                case 5:

                    System.out.println("ENTER PRODUCT ID TO EXIST OR NOT:");
                    id = sc.nextInt();


                    s1.productExist(id);
                    break;

                case 6:

                    System.out.println("ENTER PRODUCT ID TO REMOVE:");
                    id = sc.nextInt();


                    s1.removebyid(id);
                    break;

                case 7:

                    s1.count();
                    break;

                case 8:

                    System.out.println("ENTER PRODUCT NAME TO UPDATE THE PRODUCTPRICE:");
                    name = sc.next();

                    System.out.println("EMTER PRICE:");
                    price = sc.nextInt();

                    s1.updateprodcutPrice(name, price);
                    break;

                case 9:

                    s1.display();
                    break;

                case 10:

                    System.out.println("ENTER PRODUCT ID TO SEARCH:");
                    id = sc.nextInt();

                    s1.search(id);
                    break;

                case 11:

                    s1.save();
                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");
            }
        }
    }
}
