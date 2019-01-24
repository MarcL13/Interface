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
		int holdingNum;
		int remainder;
		for(int i = 0; i < holder.length(); i++)
		{
			remainder = num % 2;
			end = remainder + end;
			holdingNum = 
		}
	}
}