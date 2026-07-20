enum day {

    monday("DAY 1"),
    Tuesday("DAY 2"),
    Wednesday("DAY 3"),
    Thursday("DAY 4"),
    Friday("DAY 5"),
    Saturday("DAY 6"),
    Sunday("DAY 7");


     String days;

     day(String days){
         this.days = days;
     }

     void display(){

         System.out.println(days);

     }

        }
        public class Test24{
             public static void main(String[] args){


                 System.out.println(day.monday.days);

                 System.out.println();

                 day.monday.display();
                 day.Tuesday.display();




             }
        }