
public class Test {
	public static void main(String [] args)
	{
		Bank b1=new Bank("Axis bank","Hitech City",new Account[10]);
        System.out.println(b1.addAccount(new SavingsAccount(165676,"13/9/22",60000.00,50000.00,5)));
        System.out.print(b1.addAccount(new CurrentAccount(132456,"23/7/23",25000.00,50000.00)));
        System.out.println(b1.addAccount(new CurrentAccount(189764,"24/6/23",50000.00,60000.00)));
        System.out.println(b1.addAccount(new SavingsAccount(174890,"25/9/23",75000.00,70000.00,8)));
        System.out.println(b1.addAccount(new CurrentAccount(124680,"26/8/23",95000.00,70000.00)));
        b1.showAccounts();
        System.out.println(b1.transaction('w', 165676, 10000.00));
        System.out.println(b1.transaction('d',174890,15000.00));

	}
}
