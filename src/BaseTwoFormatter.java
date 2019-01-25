public class BaseTwoFormatter implements NumberFormatter
{
	private int number;
	
	public BaseTwoFormatter(int number)
	{
		this.number = number;
	}
	
	public String getNumFormat(int num)
	{
		String end = "";
		if(num == 0)
		{
			end = end + 0;
		}
		
		while(num > 0)
		{
			end = (num % 2) + end;
			num = num/2;
		}
		
		return end;
	}
}