import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        musicplaylist s = new musicplaylist();

        s.load();

        while(true){

            System.out.println("1. ADD MUSIC:");
            System.out.println("2. SEARCH MUSIC:");
            System.out.println("3. PLAY FIRST MUSIC:");
            System.out.println("4. PLAY LAST MUSIC:");
            System.out.println("5. REMOVE MUSIC:");
            System.out.println("6. TOTAL MUSIC:");
            System.out.println("7. CHECK PLAYLIST IS EMPTY:");
            System.out.println("8. SORT PLAYLIST:");
            System.out.println("9. DISPLAY ALL PLAYLIST:");
            System.out.println("10. EXIT");

            System.out.println("ENTER YOUR CHOICE");
            int choice = sc.nextInt();

            switch (choice){

                case 1:

                    System.out.println("ENTER MUSIC NAME");
                    String name = sc.next();

                    System.out.println("ENTER ARTIST NAME:");
                    String artist = sc.next();

                    System.out.println("ENTER DURATION:");
                    String duration = sc.next();

                    s.addmusic(new music(name,artist,duration));

                    break;

                case 2:

                    System.out.println("ENTER MUSIC NAME");
                    name = sc.next();

                    s.searchsong(name);

                    break;


                case 3:

                    s.playFirstSong();
                    break;

                case 4:

                    s.playLastSong();
                    break;

                case 5:

                    System.out.println("ENTER MUSIC NAME");
                    name = sc.next();


                    s.removesong(name);
                    break;


                case 6:

                    s.totalsong();
                    break;

                case 7:

                    s.checkPlaylistEmpty();
                    break;

                case 8:

                    s.sortsong();
                    break;

                case 9:

                    s.displayPlaylist();
                    break;

                case 10:

                    s.save();

                    System.out.println("THANK YOU");
                    return;

                default:

                    System.out.println("INVALID CHOICE");
            }

        }
    }
}
