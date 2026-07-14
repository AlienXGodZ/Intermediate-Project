import java.io.*;
import java.util.*;

class queuemanagementsystem{

    Queue<queue> store = new LinkedList<>();

    void add(queue s){

        for(queue i : store){
            if(i.name.equals(s.name)){
                System.out.println("ALREADY EXISTS:");
                return;
            }
        }
        System.out.println("SUCCESSFULLY ADDED:");
        store.offer(s);
    }

    void servePatient(){

        if(store.isEmpty()){
            System.out.println("\nNo Patient in Queue");
        }else{
            System.out.println("\nServed Patient:" + store.poll());
        }

    }

    void nextPatient(){

        if(store.isEmpty()){
            System.out.println("\nNo Patient in Queue");
        }else{
            System.out.println("\nNext Patient:" + store.peek());
        }
    }

    void display() {

        System.out.println("\nNEXT PATIENTLIST: ");

        if (store.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        } else {

            for (queue i : store) {
                System.out.println(i);
            }
        }
    }

    void countPatient(){

        System.out.println("\nNumber of TotalPatient: " + store.size());

    }

    void checkEmpty(){

        if(store.isEmpty()){
            System.out.println("\nQueue Empty");
        }else{
            System.out.println("\nQueue is not Empty");
        }
    }

    void sortname(){

        System.out.println();

        List<queue> sorted = new ArrayList<>(store);

        Collections.sort(sorted,new Comparator<queue>(){

            public int compare(queue s1, queue s2){

                return s1.name.compareTo(s2.name);
            }


        });

        for(queue i : sorted){

            System.out.println(i);
        }
    }

    void save(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("queue text"));

            for(queue i : store){
                writer.println(i.name + "," + i.age);
            }

            writer.close();
            System.out.println("SUCCESSFULLY SAVED");
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }

    void load(){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("queue text"));

            String line;

            while((line = reader.readLine()) != null){

                String[] seperate = line.split(",");

                int age = Integer.parseInt(seperate[1]);

                String name = seperate[0];

                store.offer(new queue(name,age));

            }

            reader.close();
            System.out.println("SUCCESSFULLY LOADED");
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}