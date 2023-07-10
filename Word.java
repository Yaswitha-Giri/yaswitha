class Word
{
	public static void main(String [] args)
	{
		int count=0 ,i;
		String s="Welcome";
		for(i=0;i< s.length();i++)
		{
			if( (s.charAt(i) == ' ' ) && (s.charAt(i+1) != ' '))
			{
				count=count+1;
			}
		}
		
		System.out.println(count+1);
	}
}
