import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class EmployeeManagementSystem{

    ArrayList<employee> store = new ArrayList<>();

    void addemploye(employee s){

        for(employee i : store) {

            if (s.id == i.id) {
                System.out.println("ALREADY ADDED EXIST" + s);
                return;
            }
        }
        store.add(s);
            System.out.println("ADDED SUCCESFULLY: " + s);
        }



    void display() {

        if (store.isEmpty()) {
            System.out.println("EMPTY");
        } else {

            System.out.println("\nEmployee List");

            for (employee i : store) {
                System.out.println("\n" + i.id + "," + i.name + "," + i.salary);
            }
        }
    }
    void search(String name){

        for(employee i : store){
            if(i.name.equals(name)){
                System.out.println("\nEmployee Found:" + i);
                return;
            }
        }

        System.out.println("\nEmployee Not Found");
    }

    void update(int id,String name){

        boolean condition = false;

        for(employee i : store){
            if(i.id == id){
                i.name = name;
                System.out.println("\n Employee Updated" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nNot Updated");
        }
    }

    void exists(String name){

        boolean condition = false;

        for(employee i : store){
            if(i.name.equals(name)){
                System.out.println("\n Employee Exists" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nEmployee Not Existed");
        }

    }

    void remove(String name){


        boolean condition = false;
        Iterator<employee> loop = store.iterator();

        while(loop.hasNext()){
            employee s = loop.next();

            if(s.name.equals(name)){
                loop.remove();
                System.out.println("\nSuccessfully Removed" + s);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nEmployee not Found");
        }
    }

    void count(){
        System.out.println("\nNumber of Employee:" + store.size());
    }

    void sortname(){

        Collections.sort(store, new Comparator<employee>(){

            public int compare(employee s1 , employee s2){
                return s1.name.compareTo(s2.name);
            }
        });

        for (employee i : store){
            System.out.println(i);
        }
    }

    void sortsalary(){

        Collections.sort(store, new Comparator<employee>(){

            public int compare(employee s1 , employee s2){
                return Double.compare(s1.salary,s2.salary);
            }
        });

        for (employee i : store){
            System.out.println(i);
        }
    }

    void savetofile(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("employee text"));

            for(employee i : store){
                writer.println(i.id + "," + i.name + "," + i.salary);
            }

            writer.close();
            System.out.println("Successfully Saved");

        }catch(IOException e){
            System.out.println("Error to Saved");
        }
    }

    void loadfile(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("employee text"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] seperate = line.split(",");

                int id = Integer.parseInt(seperate[0]);

                String name = seperate[1];

                double salary = Double.parseDouble(seperate[2]);

                store.add(new employee(id, name, salary));

            }
            reader.close();
            System.out.println("\nLoad Successfully");

        }catch(IOException e){
            System.out.println("Error");
        }
    }

}