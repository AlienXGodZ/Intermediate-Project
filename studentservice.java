import java.util.*;
import java.io.*;

 class studentservice{

      HashMap<Integer,student> store = new HashMap<>();


      void addStudent(int id , String name, int mark) {

          if (store.containsKey(id)) {
              System.out.println("\n Student ID is Already Exists");
              return;
          }
              store.put(id, new student(id, name, mark));
              System.out.println("\nSuccessfully Added Student");
          }

      void searchStudent(int id){

          if(store.containsKey(id)){
              System.out.println("\nStudent Founded: " + store.get(id));
          }else{
              System.out.println("\nStudent Not Found");
          }
     }

     void updatename(int id,String name){

          if(store.containsKey(id)){
              store.get(id).name = name;
              System.out.println("\nUpdated name: " + store.get(id));
          }else{
              System.out.println("\nNot Updated");
          }
     }

     void updateMark(int id,int mark){

         if(store.containsKey(id)){
             store.get(id).mark = mark;
             System.out.println("\nUpdated Mark: " + store.get(id));
         }else{
             System.out.println("\nNot Updated");
         }
     }

     void deleteStudent(int id){

          if(store.containsKey(id)){
             student remove = store.remove(id);
              System.out.println("\nSuccessFully Removed: " + remove);
          }else{
              System.out.println("\nNot Removed");
          }
     }

     void displayStudent() {

         if (store.isEmpty()) {
             System.out.println("\nIS empty");
         } else {

             for (Map.Entry<Integer, student> i : store.entrySet()) {

                 System.out.println(i.getValue());

             }
         }
     }

     void countStudent(){

          System.out.println("\nNumbder of Students:" + store.size());

     }

     void saveToFile() {

         try {

             PrintWriter writer = new PrintWriter(new FileWriter("student text"));

             for (student i : store.values()) {
                 writer.println(i.id + "," + i.name + "," + i.mark);
             }

             writer.close();

             System.out.println("\nSaved Successfully");

         } catch (IOException e) {
             System.out.println("\nError Saving File");
         }
     }

     void loadfromfile(){

          try{
              BufferedReader reader = new BufferedReader(new FileReader("student text"));

                  String line;

                     while ((line = reader.readLine()) != null) {

                         String[] seprate = line.split(",");

                         int id = Integer.parseInt(seprate[0]);

                         String name = seprate[1];

                         int mark = Integer.parseInt(seprate[2]);

                         store.put(id,new student(id,name,mark));


                  }
                     reader.close();
                     System.out.println("\nLoad SuccessFully");
              }catch(IOException e){
              System.out.println("\nNO File Found");
         }
     }
}