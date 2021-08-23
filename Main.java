
import java.lang.*;
import java.io.*;

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
				System.out.println("Zero");
			break;
			case 1:
				System.out.println("One");
			break;
			case 2:
				System.out.println("Two");
			break;
			case 3:
				System.out.println("Three");
			break;
			case 4:
				System.out.println("Four");
			break;
			case 5:
				System.out.println("Five");
			break;
			case 6:
				System.out.println("Six");
			break;
			case 7:
				System.out.println("Seven");
			break;
			case 8:
				System.out.println("Eight");
			break;
			case 9:
				System.out.println("Nine");
			break;
			default:
				System.out.println("Invalid Number");
			break;
		}
	}
}

class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number");
		int iValue = Integer.parseInt(bobj.readLine());

		ArithmeticX aobj = new ArithmeticX();
		aobj.DisplayNumber(iValue);
	}
}