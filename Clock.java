public class Clock
{
	public static void main(String [] args)
	{
		Time t = new Time();
		t.setHour(23)  ;
		t.setMinute(58);
		t.setSecond(47);
		System.out.println(t.incrh());
		System.out.println(t.incrm());
		System.out.println(t.incrs());
	}
	
}


