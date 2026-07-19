interface power{

    void turnon();

    void turnoff();

    default void status(){
        System.out.println("DEVICE IS READY");
    }

    static void company(){
        System.out.println("Smart Home");
    }
}

interface  wifi{

   void connectwifi();

}

class smartlight implements power,wifi{

    public void turnon(){

        System.out.println("LIGHT ON");

    }

    public void turnoff(){
        System.out.println("LIGHT OFF");
    }

    public void connectwifi(){
        System.out.println("Light Connect to Wifi");
    }

}

class smartac implements power,wifi{

    public void turnon(){

        System.out.println("AC TURN ON");

    }

    public void turnoff(){

        System.out.println("AC TURN OFF");

    }

    public void connectwifi(){

        System.out.println("AC CONNECTED TO WIFI");

    }

}
public class Test20{

    public static void main(String[] args){

        smartlight sl = new smartlight();
        sl.turnon();
        sl.connectwifi();
        sl.status();
        sl.turnoff();

        System.out.println();

        smartac ac = new smartac();
        ac.turnon();
        ac.connectwifi();
        ac.status();
        ac.turnoff();

        System.out.println();

        power.company();







    }




}