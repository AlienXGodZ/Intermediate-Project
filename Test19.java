abstract class shape{

    shape(){

        System.out.println("SHAPE CONSTRUCTOR");

    }

     abstract void area();

    void display(){

        System.out.println("CALCUTION AREA");

    }

}

class circle extends shape{

    double radius;

    circle(double radius){

        this.radius = radius;

    }

    void area(){

        System.out.println("AREA: " + (Math.PI * radius * radius));
    }
}

class rectangle extends shape{

    double length;
    double width;

    rectangle(double length,double width){

        this.width = width;
        this.length = length;

    }

    void area(){

        System.out.println("AREA:" + (length * width));

    }

}


public class Test19 {
    public static void main(String[] args){


      shape s;

      s = new circle(5);
      s.display();
      s.area();

      System.out.println();

      s = new rectangle(10,5);
      s.display();
      s.area();




    }
}
