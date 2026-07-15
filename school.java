public class school{
   private int id;
   private String name;
   private int mark;
    private char grade;

    school(int id,String name,int mark,char grade){

        this.id = id;
        this.name = name;

        if(mark >= 0 && mark <= 100 ){
            this.mark = mark;
        }else{
            this.mark = 0;
        }

        if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'O' || grade == 'R'){
            this.grade = grade;
        }else{
            this.grade = 'R';
        }

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getMark(){
        return mark;
    }

    public char getGrade(){
        return grade;
    }

    public void setId(int id){

        if(id >= 1){
            this.id = id;
            System.out.println("UPDATED ID SUCCESSFULLY");
        }else{
            System.out.println("LESS THAN ZERO");
        }

    }

    public void setName(String name){

        if(name.length() >= 3 ){
            this.name = name;
            System.out.println("UPDATE NAME SUCCESSFULLY");
        }else{
            System.out.println("ENTER YOUR FULL NAME:");
        }
    }

    public void setMark(int mark){

        if(mark >= 0 && mark <= 100){
            this.mark = mark;
            System.out.println("UPDATE MARK SUCCESSFULLY");
        }else{
            System.out.println("ENTER THE MARK BETWEEN 0 TO 100");
        }
    }

    public void setGrade(char grade){

        if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'O' || grade == 'R'){
            this.grade =grade;
            System.out.println("UPDATE GRADE SUCCESSFULLY");
        }else{
            System.out.println("INVALID GRADE");
        }
    }

    public void display(){

        System.out.println("\n--------SCHOOL DETAILS----------");
        System.out.println("STUDENT ID:" + id);
        System.out.println("STUDENT NAME:" + name);
        System.out.println("STUDENT MARK:" + mark);
        System.out.println("STUDENT GRADE:" + grade);

    }

}