class library{

    int bookid;
    String bookname;
    String booktitle;
    String bookauthor;


    library(int bookid,String bookname , String booktitle , String bookauthor){
        this.bookid = bookid;
        this.bookname = bookname;
        this.booktitle = booktitle;
        this.bookauthor = bookauthor;
    }

    public String toString(){
        return "BOOK ID: " + bookid + "| BOOK NAME: " + bookname + "| BOOK TITLE: " + booktitle + "| BOOK AUTHOR: " + bookauthor;
    }
}
