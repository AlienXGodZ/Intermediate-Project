class carclone{

       int id;
       String brand;
       String model;
       double price;

       carclone() {

           this.id = 0;
           this.brand = "UNKNOWN";
           this.model = "UNKNOWN";
           this.price = 0;
       }
           carclone(String brand){
               this();
               this.brand = brand;
           }

           carclone(String brand,String model) {

               this(brand);
               this.model = model;

       }

           carclone(int id,String brand,String model,double price) {

                this(brand,model);
                this.id = id;
                this.price = price;

           }

           public void display(){

                  System.out.println("\nID:" + id);
                  System.out.println("BRAND:" + brand);
                  System.out.println("MODEL:" + model);
                  System.out.println("PRICE:" + price);

           }

       }


public class Test14 {
    public static void main(String[] args){

        carclone store = new carclone();
        store.display();

        carclone store1 = new carclone("BMW");
        store1.display();

        carclone store2 = new carclone("AUDIO","A4");
        store2.display();

        carclone store3 = new carclone(1,"A","X",111);
        store3.display();








    }
}
