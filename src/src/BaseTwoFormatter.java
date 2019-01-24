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
		while(num/2 != 0)
		{
			remainder = num % 2;
			end = remainder + end;
			holdingNum = num/2;
			num = holdingNum;
		}
		return end;
	}
}