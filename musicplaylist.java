import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class musicplaylist{

    LinkedList<music> store = new LinkedList<>();

    void addmusic (music songname ){

        for(music i : store){
            if(i.songname.equals(songname.songname)) {
                System.out.println("\nALREADY EXIST");
                return;
            }
        }
        store.add(songname);
        System.out.println("\nSUCCESSFULLY ADDED");
    }

    void displayPlaylist() {

        if (store.isEmpty()) {
            System.out.println("\nPlaylist not Found!");
        } else {

            System.out.println("\nPlaylist Founded:");

            for (music i : store) {

                System.out.println(i);
            }
        }
    }

    void searchsong(String songname){

        for(music i : store){
            if(i.songname.equals(songname)){
                System.out.println("\nSong Founded! " + i);
                return;
            }
        }
        System.out.println("\n Song Not Founded");
    }

    void removesong(String songname){

        Iterator<music> loop = store.iterator();

        while(loop.hasNext()){

            music i = loop.next();

            if(i.songname.equals(songname)){
                loop.remove();
                System.out.println("\nSuccessfully Removed: " + i);
                return;
            }
        }
        System.out.println("\nNot Removed: ");
    }

    void playFirstSong(){

        if(store.isEmpty()){
            System.out.println("\nNo Playlist Found");
        }else{
            System.out.println("\nPlaylist Found: " + store.getFirst());
        }
    }

    void playLastSong(){

        if(store.isEmpty()){
            System.out.println("\nNo Playlist Found");
        }else{
            System.out.println("\nPlaylist Found: " + store.getLast());
        }
    }

    void totalsong(){

        System.out.println("\nNumber of the Song in the Playlist: " + store.size() );

    }

    void checkPlaylistEmpty(){

        if(store.isEmpty()){
            System.out.println("\nPlaylist is Empty");
        }else{
            System.out.println("\nPlaylist is not Empty");
        }
    }

    void sortsong(){

        Collections.sort(store,new Comparator<music>(){

            public int compare(music s1 , music s2){

                return s1.songname.compareTo(s2.songname);
            }
        });

        System.out.println("\nPlaylist Sorted by Name");

        for(music i : store){

            System.out.println(i);

        }
    }

    void save(){

        try{
            PrintWriter writer = new PrintWriter(new FileWriter("musicplaylist.text"));

            for(music i : store){

                writer.println(i.songname + "," + i.artist + "," + i.duration);
            }

            writer.close();
            System.out.println("SUCCESSFULLY SAVED");
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }

    void load(){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("musicplaylist.text"));

            String line;

            while((line = reader.readLine()) != null){

                String[] seperate = line.split(",");

                String name = seperate[0];

                String artist = seperate[1];

                String duration = seperate[2];

                store.add(new music(name, artist, duration));

            }

            reader.close();
            System.out.println("LOADED SUCCESSFULLY");
        }catch(IOException e){
            System.out.println("ERROR");
        }
    }
    }