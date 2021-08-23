
using System;

class ArithmeticX
{
	public void DisplayNumber(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		switch(iNo)
		{
			case 0:
				Console.WriteLine("Zero");
			break;
			case 1:
				Console.WriteLine("One");
			break;
			case 2:
				Console.WriteLine("Two");
			break;
			case 3:
				Console.WriteLine("Three");
			break;
			case 4:
				Console.WriteLine("Four");
			break;
			case 5:
				Console.WriteLine("Five");
			break;
			case 6:
				Console.WriteLine("Six");
			break;
			case 7:
				Console.WriteLine("Seven");
			break;
			case 8:
				Console.WriteLine("Eight");
			break;
			case 9:
				Console.WriteLine("Nine");
			break;
			default:
				Console.WriteLine("Invalid Number");
			break;
		}
	}
}

class main
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter Number");
		int iValue = Convert.ToInt32(Console.ReadLine());

		ArithmeticX aobj = new ArithmeticX();
		aobj.DisplayNumber(iValue);
	}
}