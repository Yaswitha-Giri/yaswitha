
public class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount () {}

 

    public CurrentAccount(int accountNo, String openedDate, double balance,double overDraftLimit) {
        super(accountNo,openedDate,balance);
        this.overDraftLimit = overDraftLimit;
    }

 

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

 

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = Validate(overDraftLimit);
    }
    private double Validate(double overDraftLimit)
    {
        if(overDraftLimit<=100000.00)
        {
            return overDraftLimit;
        }
        return 0.00;
    }


 

}