import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class productcatalog1{

    TreeMap<Integer,productcatalog> store = new TreeMap<>();

    void add(int id ,productcatalog s) {

        if (store.containsKey(id)) {
            System.out.println("ALREADY EXIST");
            return;
        }
        store.put(id,s);
        System.out.println("ADDED SUCCESSFULLY");
    }

    void search(int id){

        if(store.containsKey(id)){
            System.out.println("\nFounded:" + "PRODUCT Name: " + store.get(id).productname + "PRODUCT PRICE: " + store.get(id).price);
        }else{
            System.out.println("\nNOT FOUNDED");
        }
    }

    void search(String productname){

        for(Map.Entry<Integer,productcatalog> loop : store.entrySet()){
            if(loop.getValue().productname.equals(productname)){
                System.out.println("\nFounded: " + "PRODUCT ID: " + loop.getKey() + "| PRODUCT NAME:" + loop.getValue().productname + "| PRODUCT PRICE: " + loop.getValue().price );
                return;
            }
        }

        System.out.println("\nNot Founded");
    }


    void updateProductName(int id,String productname){

        if(store.containsKey(id)){
            store.get(id).productname = productname;
            System.out.println("\nSUCCESSFULLY UPDATED: " + "| PRODUCT ID: " + id + "| PRODUCT NAME: " + store.get(id).productname + "| PRODUCT PRICE: " + store.get(id).price);
        }else{
            System.out.println("\nNot Updated");
        }
    }

    void updateprodcutPrice(String productname, double productprice){

        for(Map.Entry<Integer,productcatalog> loop : store.entrySet()){

            if(loop.getValue().productname.equals(productname)){
                loop.getValue().price = productprice;
                System.out.println("\nSuccessfully Updated: " + "PRODUCT ID: " + loop.getKey() + "| PRODUCT NAME:" + loop.getValue().productname + "| PRODUCT PRICE: " + loop.getValue().price );
                return;
            }
        }
        System.out.println("\nNot Updated");

    }


    void removebyname(String productname){

        Iterator<Map.Entry<Integer,productcatalog>> loop = store.entrySet().iterator();

        while(loop.hasNext()){

            Map.Entry<Integer,productcatalog> i = loop.next();

            if(i.getValue().productname.equals(productname)){
                loop.remove();
                System.out.println("\nsuccessfully Removed:" + "PRODUCT NAME: " + i.getValue().productname + "PRODUCT PRICE" + i.getValue().price);
                return;
            }
        }
        System.out.println("\nNot Removed");

    }

    void removebyid(int id){

        if(store.containsKey(id)){
            System.out.println("\nSUCCESSFULLY REMOVED:" + store.remove(id));
        }else{
            System.out.println("\nNot Removed");
        }
    }

    void display() {

        if (store.isEmpty()) {
            System.out.println("IS EMPTY");
        } else {


            for (Map.Entry<Integer, productcatalog> s1 : store.entrySet()) {

                System.out.println(s1);
            }

        }
    }

    void count(){

        System.out.println("\nNumber of Product:" + store.size());
    }

    void productExist(int id){

        if(store.containsKey(id)){
            System.out.println("Product Exist: " + "| PRODUCT NAME: " + store.get(id).productname + "| PRODUCT PRICE: "  + store.get(id).price);
        }else{
            System.out.println("Product is Not Exists");
        }
    }

    void save(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("productcatalog.txt"));

            for(Map.Entry<Integer,productcatalog> i : store.entrySet()){
                writer.println(i.getKey() + "," + i.getValue().productname + "," + i.getValue().price);
            }

            writer.close();
            System.out.println("\nSuccessfully added");

        }catch(IOException e){

            System.out.println("\nERROR");

        }
    }

    void load(){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("productcatalog.txt"));

            String line;

            while((line = reader.readLine()) != null){

                String[] seperate = line.split(",");

                int id = Integer.parseInt(seperate[0]);

                String productname = seperate[1];

                double productprice  = Double.parseDouble(seperate[2]);

                store.put(id,new productcatalog(productname,productprice));

            }

            System.out.println("\nSUCCESULLY LOADED");

            reader.close();



        }catch (IOException e){
            System.out.println("\nERROR");
        }


    }




    }

