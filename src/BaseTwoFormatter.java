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
		int newNum = num;
		while(newNum >= 0)
		{
			end = (num % 2) + end;
			newNum = num/2;
		}
		return end;
	}
}