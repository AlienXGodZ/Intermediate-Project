class car{

    int id;
    String brand;
    String model;
    double price;


    car(){
       id = 0;
       brand = "unknown";
       model = "unknown";
       price = 0;
    }

    car(int id,String brand,String model,double price){

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;

    }

    car(String brand){
        this.id = 1;
        this.brand = brand;
        this.model = "unknown";
        this.price = 0;

    }

    car(String brand,String model){
        this.id = 0;
        this.brand = brand;
        this.model = model;
        this.price = 0;
    }

    car(car other){
        this.id= other.id;
        this.brand = other.brand;
        this.model = other.model;
        this.price = other.price;


    }

}

 public class Test13{
    public static void main(String[] args){

        car store = new car();
        System.out.println(store.id);
        System.out.println(store.brand);
        System.out.println(store.model);
        System.out.println(store.price);

        car store1 = new car(1,"BMW","xs",1000000.00);
        System.out.println(store1.id);
        System.out.println(store1.brand);
        System.out.println(store1.model);
        System.out.println(store1.price);



        car store2 = new car("AUDIO");
        System.out.println(store2.id);
        System.out.println(store2.brand);
        System.out.println(store2.model);
        System.out.println(store2.price);

        car store3 = new car("HONDIO","a4");
        System.out.println(store3.id);
        System.out.println(store3.brand);
        System.out.println(store3.model);
        System.out.println(store3.price);



        car store4 = new car(store1);
        System.out.println(store4.id);
        System.out.println(store4.brand);
        System.out.println(store4.model);
        System.out.println(store4.price);






    }
 }

















