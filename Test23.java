enum signal{

    RED,
    YELLOW,
    GREEN

}

public class Test23{
    public static void main(String[] args){

        signal r = signal.RED;
        System.out.println(r);

        signal y = signal.YELLOW;
        System.out.println(y);

        signal g = signal.GREEN;
        System.out.println(g);

        System.out.println();

        signal c = signal.YELLOW;

        switch (c){

            case RED :

                System.out.println("STOP");
                break;

            case YELLOW:

                System.out.println("READY");
                break;

            case GREEN:

                System.out.println("GO");
                break;


        }

        System.out.println();

        for(signal l : signal.values()){
            System.out.println(l);
        }

        System.out.println();

        System.out.println(signal.RED.ordinal());
        System.out.println(signal.YELLOW.ordinal());
        System.out.println(signal.GREEN.ordinal());

        System.out.println();

        signal cv = signal.valueOf("RED");
        System.out.println(cv);



    }

}