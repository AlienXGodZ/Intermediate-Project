class Library{

     String libraryname = "City Library";

    class Book{

        String bookname;

        Book(String bookname){
            this.bookname = bookname;
        }

        void display(){

            System.out.println("LIBRARY:" + libraryname);
            System.out.println("BOOK:" + bookname);
        }
    }

    static class rules{

        void rules1(){
            System.out.println("1.Stay Silent in library");
        }

        void rules2(){
            System.out.println("2.Keep Silent your Phone in Library");
        }

    }

    void method(){

        class Library1{

            void branch() {
                System.out.println("MADURAI LIBRARY 1st branch");
            }

        }

        Library1 l1 = new Library1();
        l1.branch();
    }
}


public class Test21{
    public static void main(String[] args){

        Library l = new Library();

        Library.Book i = l.new Book("OPPENHEIMER");

        i.display();


        Library.rules r = new Library.rules();
        r.rules1();
        r.rules2();


        Library ly = new Library();
        ly.method();







    }



}