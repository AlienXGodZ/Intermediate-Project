import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

class visittracker {

    HashSet<visitor> store = new HashSet<>();

    void add(visitor s) {

        for(visitor i : store) {
            if (i.name.equals(s.name)) {
                System.out.println("ALREADY EXIST");
                return;
            }
        }
        store.add(s);
        System.out.println("ADDED SUCCESSFULLY");
    }

    void display() {


        if (store.isEmpty()) {
            System.out.println("IS EMPTY");
        } else {

            System.out.println("\nVisitor List:");
            for (visitor i : store) {
                System.out.println(i);
            }
        }
    }

    void visitExist(String name) {

        for (visitor i : store) {
            if (i.name.equals(name)) {
                System.out.println("\nEXIST:" + i);
                return;
            }
        }
        System.out.println("\nNOT EXIST");
    }

    void remove(String visitorname) {

        Iterator<visitor> loop = store.iterator();

        while (loop.hasNext()) {
            visitor i = loop.next();

            if (i.name.equals(visitorname)) {
                loop.remove();
                System.out.println("\nRemoved Successfully:" + i);
                return;
            }
        }
        System.out.println("\nNot Removed");
    }


    void countvisitor() {
        System.out.println("\nNumber Of visitor: " + store.size());
    }

    void removeall() {
        store.clear();
    }

    void isempty() {

        if (store.isEmpty()) {
            System.out.println("\nNo Visitor");
        } else {
            System.out.println("\nVisitor Founded");
        }

    }

    void save(){

        try{

            PrintWriter writer = new PrintWriter(new FileWriter("visitor.txt"));

            for(visitor i : store){

                writer.println(i.name);
            }

            writer.close();
            System.out.println("SAVED SUCCESSFULLY");
        } catch(IOException e) {
            System.out.println("ERROR");
        }
    }

    void load(){

        try {

            BufferedReader reader = new BufferedReader(new FileReader("visitor.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String name = line;

                store.add(new visitor(name));

            }

            reader.close();
            System.out.println("LOADED SUCCESULLY");

        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}