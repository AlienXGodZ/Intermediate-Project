import java.util.*;

public class employee{
    int id;
    String name;
    double salary;

    employee(int id,String name,double salary){

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public String toString(){
        return "EmployeeId: " + id + "| EmployeeName:" + name + "| EmployeeSalary:" + salary;
    }
}
