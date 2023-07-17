
public class SavingsAccount extends Account{
    private  double minimumDepositAmount;
    private int noOfTransactionPerDay;

    public SavingsAccount () {}

 

    public SavingsAccount(int accountNo, String openedDate, double balance,double minimumDepositAmount, int noOfTransactionPerDay) {
        super(accountNo,openedDate,balance);
        this.minimumDepositAmount = minimumDepositAmount;
        this.noOfTransactionPerDay = noOfTransactionPerDay;
    }

 

    public double getMinimumDepositAmount() {
        return minimumDepositAmount;
    }

 

    public void setMinimumDepositAmount(double minimumDepositAmount) {
        this.minimumDepositAmount = minimumDepositAmount;
    }

 

    public int getNoOfTransactionPerDay() {
        return noOfTransactionPerDay;
    }

 

    public void setNoOfTransactionPerDay(int noOfTransactionPerDay) {
        this.noOfTransactionPerDay = noOfTransactionPerDay;
    }

}