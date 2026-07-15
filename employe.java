public class employe {
    private int id;
    private String name;
    private double salary;
    private String department;

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    employe(int id, String name,double salary,String department){

        this.id = id;
        this.name = name;

        if(salary > 0){
            this.salary = salary;
        }else{
            this.salary = 0;
        }

        this.department = department;
    }

    public void display(){

        System.out.println("\n---------EMPLOYEE DETAILS---------");
        System.out.println("EMPLOYEE ID:" + id);
        System.out.println("EMPLOYEE NAME:" + name);
        System.out.println("EMPLOYEE SALARY:" + salary);
        System.out.println("EMPLOYEE DEPARTMENT:" + department);

    }

    public void setId(int id){

        if(id >= 1){
            this.id = id;
            System.out.println("SUCCESSFULLY ID UPDATED");
        }else{
            System.out.println("INVALID NUMBER TO UPDATE ID");
        }
    }
    public void setName(String name){

        if(name.length() >= 3){
            this.name = name;
            System.out.println("SUCCESSFULLY NAME UPDATED");
        }else{
            System.out.println("ENTER YOUR FULLNAME");
        }
    }

    public void setSalary(double salary){

        if(salary > 0){
            this.salary = salary;
            System.out.println("update SALARY");
        }else{
            System.out.println("NOT UPDATED SALARY");
        }


    }









    public void setDepartment(String department){

        if(department.length() >= 3){
            this.department = department;
            System.out.println("SUCCESSFULLY DEPARTMENT NAME UPDATED");
        }else{
            System.out.println("ENTER FULL DEPARTMENT NAME");
        }
    }
}
