import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class MovieCollection{

    ArrayList<movie> store = new ArrayList<>();

    void addmovie(movie s){

        for(movie i : store){
            if(i.id == s.id){
                System.out.println("\nALREADY EXIST");
                return;
            }
        }
        store.add(s);
        System.out.println("\nSUCCESSFULLY ADDED");
    }


    void search(String s){

        boolean condition = false;

        for(movie i : store){

            if(i.name.equals(s)){
                System.out.println("\nMovie Founded:" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nMovie Not Found");
        }
    }

    void update (String s  , double m){

        boolean condition = false;

        for(movie i : store){
            if(i.name.equals(s)){
                i.rating = m;
                System.out.println("\nUpdated: " + i);
                condition = true;
                break;
            }
        }

        if(!condition){
            System.out.println("\nNot Updated");
        }
    }

    void remove(int id){

        boolean condition = false;
        Iterator<movie> loop = store.iterator();

        while(loop.hasNext()){
            movie search = loop.next();

            if(search.id == id){
                loop.remove();
                condition = true;
                System.out.println("\nSuccessfully Movie removed: " + search);
                break;
            }
        }
        if(!condition){
            System.out.println("\nMovie is not founded or remove");
        }
    }

    void display() {

        if (store.isEmpty()) {
            System.out.println("Empty");
        } else {

            System.out.println("\nMovie List:");

            for (movie i : store) {

                System.out.println(i);

            }
        }
    }

    void sortname() {

        Collections.sort(store, new Comparator<movie>() {
            @Override
            public int compare(movie s1, movie s2) {
                return s1.name.compareTo((s2.name));
            }
        });

        System.out.println("\nSorted By Name:" + store);

    }


    void sortrating(){

        Collections.sort(store, new Comparator<movie>() {
            @Override
            public int compare(movie s1, movie s2) {
                return Double.compare(s1.rating,s2.rating);
            }
        });

        System.out.println("\nSorted By mark:" + store);

    }

    void countmovie(){

        System.out.println("\nThe Number of Movie:" + store.size());

    }

    void movieExists(String name) {

        for (movie s : store) {
            if (s.name.equals(name)) {
                System.out.println("\nMovie Exists");
                return;
            }
        }

        System.out.println("\nMovie Does Not Exist");
    }

    void save(){

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("movie text"));

            for (movie i : store) {
                writer.println(i.id + "," + i.name + "," + i.rating);
            }

            writer.close();
            System.out.println("\nSUCCESSFULLY SAVED");
        }catch(IOException e){
            System.out.println("\nERROR");
        }
    }

    void load(){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("movie text"));

            String line;

            while((line = reader.readLine()) != null ){

                String[] seperate = line.split(",");

                int id = Integer.parseInt(seperate[0]);

                String name = seperate[1];

                double rating = Double.parseDouble(seperate[2]);

                store.add(new movie(id,name,rating));

            }

            reader.close();

            System.out.println("\nLoaded Successfully");

        }catch(IOException e){
            System.out.println("\nERROR");
        }
    }

}