class BankAccounnt{
    private int accountNumber();
    private String accountHolder();
    private double balance();

    BankAccounnt(int accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountNumber(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double vithdrawCash(double ammount){
        try {
            if(balance >= ammount){
                balance-=ammount;
            } else {
                int error = 1/0;
            }
                
    } catch (IllegalArgumentException e) {
            System.out.println("Insefitient Crdit in your account for the Withdrale");
    }
}

class Problem03{
    public static void main(String args[]){

    }
}