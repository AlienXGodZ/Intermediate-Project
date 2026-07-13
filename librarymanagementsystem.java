import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class libraryManagementSystem{

    ArrayList<library> store = new ArrayList<>();

    void add(library s){

        for(library i : store){
            if(i.bookid == s.bookid){
                System.out.println("\nALREADY EXIST");
                return;
            }
            }
           store.add(s);
        System.out.println("\nADDED SUCCESSFULLY");
        }


    void display() {

        if (store.isEmpty()) {
            System.out.println("\nEmpty");
        } else {

            System.out.println("\nLibrary List");

            for (library i : store) {
                System.out.println(i);
            }
        }
    }

    void Search(String name){

        for(library i : store){
            if(i.bookname.equals(name)){
                System.out.println("\nBook Founded" + i);
                return;
            }
        }
        System.out.println("\nBook Not Founded");
    }

    void update(String name,String author){

        for(library i : store){

            if(i.bookname.equals(name)){
                i.bookauthor = author;
                System.out.println("\nSuccessfully Updated" + i);
                return;
            }
        }
        System.out.println("\nNot Updated");
    }

    void remove(String author){

        Iterator<library> loop = store.iterator();

        while(loop.hasNext()){
            library x = loop.next();

            if(x.bookauthor.equals(author)){
                loop.remove();
                System.out.println("\nSuccessully Removed" + x);
                return;
            }
        }
        System.out.println("\nNOt removed");
    }


    void sortBookName(){

        Collections.sort(store, new Comparator<library>(){

            public int compare(library s1 , library s2){

                return s1.bookname.compareTo(s2.bookname);
            }
        });

        for(library i : store){
            System.out.println(i);
        }

    }

    void sortBookAuthor(){

        Collections.sort(store, new Comparator<library>(){

            public int compare(library s1 , library s2){

                return s1.bookauthor.compareTo(s2.bookauthor);
            }
        });

        for(library i : store){
            System.out.println(i);
        }

            }

    void total() {

        System.out.println("\nNumber of Books: " + store.size());
    }

    void exists(String author){

        for(library i : store){
            if(i.bookauthor.equals(author)) {
                System.out.println("\nBook is in Stock" + i);
                return;
            }
        }
        System.out.println("\nBook is not in stock");
    }

    void save(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("library text"));

            for(library i : store){
                writer.println(i.bookid + "," + i.bookname + "," + i.booktitle + "," + i.bookauthor);
            }

            writer.close();
            System.out.println("\nSuccessfully added");

        }catch(IOException e){

            System.out.println("\nERROR");

        }
    }

    void load(){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("library text"));

            String line;

            while((line = reader.readLine()) != null){

                String[] seperate = line.split(",");

                int bookid = Integer.parseInt(seperate[0]);

                String bookname = seperate[1];

                String booktitle = seperate[2];

                String bookauthor = seperate[3];

                store.add(new library(bookid,bookname,booktitle,bookauthor));

            }

            System.out.println("\nSUCCESULLY LOADED");

            reader.close();



        }catch (IOException e){
            System.out.println("\nERROR");
        }


    }





}