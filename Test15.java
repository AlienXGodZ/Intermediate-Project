class calculator3{

    int result;
}


class calculator{

    int add(int a,int b){
        return a + b;
    }

    int add(int a,int b,int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

class calculator1{

    void change(int x){

        x = 100;
    }

}

class calculator4 {

    calculator3 createCalculator() {


        calculator3 obj3 = new calculator3();

        obj3.result = 500;

        return obj3;

    }
}


class Calculator5 {

    int multiply(int a, int b) {

        return a * b;
    }

}

class Calculator6{

    static int square(int x){

        return x * x;
    }

}



public class Test15{
    public static void main(String[] args){

        calculator obj = new calculator();

        System.out.println(obj.add(1,2));

        System.out.println(obj.add(1,2,3));

        System.out.println(obj.add(1.0,2.0));
        System.out.println();


        calculator1 sm = new calculator1();

        int num = 10;
        System.out.println(num);


        sm.change(num);
        System.out.println(num);
        System.out.println();

        calculator4 hi = new calculator4();
        calculator3 myobj = hi.createCalculator();
        System.out.println(myobj.result);
        System.out.println();


        Calculator5 v = new Calculator5();
        System.out.println(v.multiply(2,4));
        System.out.println();


        System.out.println(Calculator6.square(4));
        System.out.println();



    }
}