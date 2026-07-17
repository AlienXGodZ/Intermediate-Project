class vehicle {

    String brand;

    vehicle(String brand) {
        this.brand = brand;
        System.out.println("VEHICLE CONSTRUCTOR");
    }

    void display() {
        System.out.println("BRAND" + brand);
    }
}

  class bike extends vehicle{

    int millage;

    bike(String brand,int millage){
        super(brand);
        this.millage = millage;
    }

    void bikeinfo(){

        display();

        System.out.println("Millage" + millage);

    }

}

class cars extends vehicle{

    int seats;

    cars(String brand,int seats){
        super(brand);
        this.seats = seats;
    }

    void carinfo(){

           display();

           System.out.println("seats:" + seats );

    }

}

public class Test17{
    public static void main(String[] args){

        bike b = new bike("R15",200);

       b.bikeinfo();

       System.out.println();

       cars c = new cars("BMW",5);

       c.carinfo();







    }
}