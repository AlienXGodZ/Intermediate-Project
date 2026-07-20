import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class anonyms {

    String name;
    int age;
    int mark;

    anonyms(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;

        }


    }


    class student22{

      ArrayList<anonyms> store = new ArrayList<>();

      void add(anonyms s){
          store.add(s);
    }

    void sortbyname(){

        Collections.sort(store, new Comparator<anonyms>() {
            @Override
            public int compare(anonyms s1, anonyms s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for(anonyms i : store){
            System.out.println(i.name);
        }

    }

    void display(){
          System.out.println("DISPLAYING");
    }

}

public class Test22{
    public static void main(String[] args){

        student22 s = new student22();

        s.add(new anonyms("ALLEN",20,200));
        s.add(new anonyms("JOAN",22,4000));

        s.sortbyname();

        System.out.println();

        student22 s1 = new student22(){

            void display(){
                System.out.println("DISPLAYING PART 2");
            }

        };

        s1.display();







    }
}