public class Main {
    public static void main(String [] args)
    {

        Bank b1=new Bank("Axis bank","Hitech City",new Account[10]);
        b1.addAccount(new Account(165676,"13/9/22",60000.00));
        b1.addAccount(new Account(132456,"23/7/23",25000.00));
        b1.addAccount(new Account(189764,"24/6/23",50000.00));
        b1.addAccount(new Account(174890,"25/9/23",75000.00));
        b1.addAccount(new Account(124680,"26/8/23",95000.00));
        b1.showAccounts();
        System.out.println(b1.transaction('w', 165676, 10000.00));
        System.out.println(b1.transaction('d',174890,15000.00));
        SavingsAccount s1=new SavingsAccount();
        s1.setMinimumDepositAmount(100000.00);
        System.out.println(s1.getMinimumDepositAmount());
        s1.setNoOfTransactionPerDay(10);
        System.out.println(s1.getNoOfTransactionPerDay());
        CurrentAccount c1=new CurrentAccount();
        c1.setOverDraftLimit(50000.00);
        System.out.println(c1.getOverDraftLimit());
        
        }
}