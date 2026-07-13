public class student{

    int id;
    String name;
    int mark;

    student(int id , String name,int mark){

        this.id = id;
        this.name = name;
        this.mark = mark;

    }

    public String toString(){
        return "Student ID: " + id + "," + "Student Name: " + name + "," + "Student Mark: " + mark;
    }

}