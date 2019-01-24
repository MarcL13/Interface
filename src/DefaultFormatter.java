public class DefaultFormatter implements NumberFormatter
{
	private int number;
	
	public DefaultFormatter(int number)
	{
		this.number = number;
	}
	
	public String getNumFormat(int num)
	{
		String holder = "" + num;
		String end = "";
		for(int i = holder.length() - 1; i >= 0; i--)
		{
			String next = holder.substring(i,i+1);
			if(holder.substring(i).length() % 3 == 0)
			{
				if(i == 0)
				{
					end = next + end;
				}
				else
				{
					end = "," + next + end;
				}
			}
			else if (holder.substring(i).length() % 3 != 0)
			{
				end = next + end;
			}
		}
		return end;
		
	}
}

