public class bankaccount {
    private int accountnumber;
    private String accountholder;
    private double balance;


    public int getAccountnumber() {
        return accountnumber;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public double getBalance() {
        return balance;
    }

    bankaccount(int accountnumber,String accountholder,double balance){

        this.accountnumber = accountnumber;
        this.accountholder = accountholder;


        if(balance >= 0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    public void setAccountholder(String accountholder){

        if(accountholder.length() >= 3){
            this.accountholder = accountholder;
            System.out.println("Account Holder Updated Successfully.");
        }else{
            System.out.println("Name must contain at least 3 characters.");
        }
    }

    public void setAccountnumber(int accountnumber){

        if(accountnumber >= 5){
            this.accountnumber = accountnumber;
            System.out.println("ACCOUNT NUMBER IS UPDATED");
        }else{
            System.out.println("ACCOUNT NUMBER MUST BE GREATER THAN EQUAL TO 5");
        }
    }

    public void deposit(int amount){

        if(amount > 0){
            balance += amount;
            System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        }else{
            System.out.println("INVALID DEPOSIT AMOUNT");
        }
    }

    public void withdraw(int amount){

        if(amount <= 0 ){
            System.out.println("INVALID NUMBER");
        }else if(amount > balance){
            System.out.println("INVALID BALANCE");
        } else{
            balance -= amount;
            System.out.println("WITHDRAW SUCCESSFULLY");
        }
    }

    public void display(){

        System.out.println("\n--------ACCOUNT DETAILS________");
        System.out.println("ACCOUNT NUMBER:" + accountnumber);
        System.out.println("ACCOUNT HOLDER:" + accountholder);
        System.out.println("ACCOUNT BALANCE:" + balance);

    }
}
