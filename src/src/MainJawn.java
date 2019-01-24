public class MainJawn
{

	public static void main(String[] args)
	{
		Measurable[] myArr = new Measurable[15];
		for(int i = 0; i < 15; i++)
		{
			myArr[i] = new BankAccount(Math.random() * 4000 + 3000);
		}
		System.out.println("Balance Population: " + findAverage(myArr));

		DefaultFormatter test = new DefaultFormatter(100);
		System.out.println(test.getNumFormat(100));
		
		BaseTwoFormatter test1 = new BaseTwoFormatter(2);
		System.out.println(test1.getNumFormat(2));
	}
	
	private static double findAverage(Measurable[] arr)
	{
		double total = 0;
		for(Measurable object : arr)
		{
			total += object.getMeasure();
		}
		return total/arr.length;
	}

	}