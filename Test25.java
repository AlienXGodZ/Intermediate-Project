enum month{

    Janurary("Month 1"),
    Feburavy("Month 2"),
    March("Month 3"),
    April("Month 4"),
    May("Month 5"),
    June("Month 6"),
    July("Month 7");


    String months;

      private month(String months){
          this.months = months;
      }

      public String getMonths(){
          return months;
      }

}

public class Test25{
    public static void main(String[] args){

        month m = month.April;

        System.out.println(m.getMonths());



    }
}