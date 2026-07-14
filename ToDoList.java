import java.io.*;
import java.util.ArrayDeque;

class TodoList1{

    ArrayDeque<TodoList> store = new ArrayDeque<>();

    void addFirst(TodoList s){

        for(TodoList i : store){
            if(i.todtask.equals(s.todtask)){
                System.out.println("ALREADY EXIST");
                return;
            }
        }
        store.offerFirst(s);
        System.out.println("ADDED AT FIRST SUCCESSFULLY");
    }

    void addLast(TodoList s){

        for(TodoList i : store) {
            if (i.todtask.equals(s.todtask)) {
                System.out.println("ALREADY EXIST");
                return;
            }
        }
        store.offerLast(s);
        System.out.println("ADDED AT LAST SUCCESSFULLY");
    }

    void add(TodoList s){

        for(TodoList i : store) {
            if (i.todtask.equals(s.todtask)) {
                System.out.println("ALREADY EXIST");
                return;
            }
        }
        store.offer(s);
        System.out.println("ADDED SUCCESSFULLY");
    }

    void completeFirstTask() {

        if (store.isEmpty()) {
            System.out.println("\nTask is not Found");
        } else {
            System.out.println("\n Completed: " + store.pollFirst());

        }
    }

    void removeLastTask() {

        if (store.isEmpty()) {
            System.out.println("\nTask is not Found");
        } else {

            System.out.println("\nTask Removed: " + store.pollLast());

        }
    }

    void viewFirstTask() {

        if (store.isEmpty()) {
            System.out.println("\nTask is not Found");
        } else {

            System.out.println("\nFirst Task: " + store.peekFirst());

        }
    }

    void viewLastTask() {

        if (store.isEmpty()) {
            System.out.println("\nTask is not Found");
        } else {

            System.out.println("\nlast Task: " + store.peekLast());

        }
    }

    void display() {

        if (store.isEmpty()) {
            System.out.println("\nNo Task Founded");
        } else {
            System.out.println("\nTask Founded: ");

            for (TodoList i : store) {

                System.out.println(i);
            }
        }
    }

    void count(){
        System.out.println("\nNumber of Tasktodo: " + store.size());
    }

    void checkEmpty(){

        if(store.isEmpty()){
            System.out.println("\nTask is empty");
        }else{
            System.out.println("\nTask is Not Empty");
        }


    }

    void save(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("todolist txt"));

            for(TodoList i : store){
                writer.println(i.todtask);
            }

            writer.close();
            System.out.println("SUCCESSFULLY SAVED");
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }

    void load(){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("todolist txt"));

            String line;

            while((line = reader.readLine()) != null){

                String name = line;

                store.offer(new TodoList(name));

            }

            reader.close();
            System.out.println("SUCCESSFULLY LOADED");

        }catch (IOException e){
            System.out.println("ERROR");
        }
    }



}