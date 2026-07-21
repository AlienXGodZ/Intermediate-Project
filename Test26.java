import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test26 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER STUDENT NAME: ");
        String name = sc.nextLine();


        LocalDate today = LocalDate.now();

        System.out.println("ENTER ENTRY HOUR:");
        int inhour = sc.nextInt();

        System.out.println("ENTER ENTRY MIN:");
        int inmin = sc.nextInt();

        LocalTime intime = LocalTime.of(inhour,inmin);

        System.out.println("ENTER EXIT HOUR:");
        int exithour = sc.nextInt();

        System.out.println("ENTER EXIT MIN:");
        int exitmin = sc.nextInt();

        LocalTime outtime = LocalTime.of(exithour,exitmin);

        LocalDateTime login = LocalDateTime.of(today,intime);
        LocalDateTime logout = LocalDateTime.of(today,outtime);

        Duration duration = Duration.between(login,logout);

        LocalDate examdate = LocalDate.of(2027,04,19);
        Period period = Period.between(today,examdate);

        DateTimeFormatter dayformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("hh-mm");


        System.out.println("-------ATTENDANCE REPORT--------");

        System.out.println("STUDENT NAME:" + name);
        System.out.println("TODAY DATE:" + today.format(dayformat));
        System.out.println("ENTRY TIME:" + login.format(timeformat));
        System.out.println("EXIT TIME:" + logout.format(timeformat));
        System.out.println("WORKED HOUR:" + duration.toHours());
        System.out.println("WORKED MIN:" + duration.toMinutes());

        System.out.println("EXAM REMAINING:" + period.getMonths() + " MONTH(s) " + period.getDays() + " DAY(s) ");

        if(duration.toHours() >= 6){

            System.out.println("ATTENDANCE : PRESENT");

        }else{
            System.out.println("ATTENDANCE : HALF DAY");
        }

















    }
}
