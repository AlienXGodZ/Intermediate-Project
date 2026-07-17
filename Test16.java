class animal{

    String name = "GOAT";

    animal(){

        System.out.println("ANIMAL CONSTRUCTOR");

    }

    void display(){
        System.out.println("I AM AN ANIMAL");
    }
}

class dog extends animal{

    String name = "DOG";

    dog(){
        System.out.println("DOG CONSTRUCTOR");
    }

    void show(){

        System.out.println(name);
        System.out.println(super.name);

        super.display();
    }
}

public class Test16{
    public static void main(String[] args){


        dog d = new dog();
        d.show();




    }
}