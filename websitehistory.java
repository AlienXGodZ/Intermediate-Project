import java.io.*;
import java.util.*;

class websitehistory {

    Stack<website> store = new Stack<>();

    void visitWebsite(website WebsiteName) {

        for (website i : store) {
            if (i.websitename.equals(WebsiteName.websitename)) {
                System.out.println("\nALREADY EXIST");
                return;
            }
        }
        store.push(WebsiteName);
        System.out.println("SUCCESSFULLY ADDED");
    }


    void back(){

        if(store.isEmpty()){
            System.out.println("\nNo Website History");
            return;
        }

        store.pop();

        if(store.isEmpty()){
            System.out.println("\nNo Previous Website");
        }else{
            System.out.println("\nCurrent Website: " + store.peek());
        }
    }

    void currentWebsite(){

        if(store.isEmpty()){
            System.out.println("\nNo Website we can see");
        }else{
            System.out.println("\nCUURENT WEBSITE: " + store.peek());
        }
    }

    void displayHistory() {

        if (store.isEmpty()) {
            System.out.println("\nThere is no History");
        } else {

            for (website i : store) {
                System.out.println(i);
            }
        }
    }

    void countHistory(){

        System.out.println("\nNumber of History:" + store.size());

    }

    void clearHistory(){

        store.clear();
        System.out.println("\nHistory Deleted: ");

    }

    void isHistoryEmpty() {

        if (store.isEmpty()) {
            System.out.println("\nHistory is Empty");
        } else {
            System.out.println("\nHistory is not Empty");
        }
    }

    void sortWebsitename(){

        System.out.println();

        List<website> list = new ArrayList<>(store);

        Collections.sort(list, new Comparator<website>() {

            public int compare(website s1 , website s2){

                return s1.websitename.compareTo(s2.websitename);
            }
        });

        for(website i : list){

            System.out.println(i);

        }


    }

    void save(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("website.text"));

            for(website i : store){
                writer.println(i.websitename);
            }

            writer.close();
            System.out.println("SUCCESSFULLY SAVED");
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }

    void load() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("website.text"));

            String line;

            while ((line = reader.readLine()) != null) {

                String name = line;

                store.push(new website(name));
            }

            reader.close();
            System.out.println("SUCCESSFULLY LOADED");
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}