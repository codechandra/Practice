import java.util.*;
import java.io.*;
public class Calci
{
	String name;
	float lastmonth_percentage;
	int month_number,total_months,total_workingdays;
	void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter last month percentage");
		lastmonth_percentage=s.nextFloat();
		System.out.println("Enter total number of working months in this sem");
		total_months=s.nextInt();
		System.out.println("Enter current month number");
		month_number=s.nextInt();
		System.out.println("Enter total number of working days in this month");
		total_workingdays=s.nextInt();
	}
	void calculate()
	{
		int hoursToAttend=(int)((((75*month_number)-lastmonth_percentage))*total_workingdays)/100;
		int hoursToAttend1=(int)((((65*month_number)-lastmonth_percentage))*total_workingdays)/100;
		if(hoursToAttend>total_workingdays&&hoursToAttend1>total_workingdays)
		{
				System.out.println("OOPS!! YOU ARE HELPLESS.YOU'VE TO ATTEND MINIMUM"+hoursToAttend1+"TO PAY CONDONATION");
		}
		else if(hoursToAttend1<=total_workingdays&&hoursToAttend>total_workingdays)
		{
			System.out.println("Sorry you've to pay condonation and should attend atleast "+hoursToAttend1+" to be safe");
		}
		else
		{
			System.out.println("Hurray!! You've to attend atleast "+hoursToAttend+" classes to get 75%");
		}
		
	}
	public static void main(String[] args)
	{
		Calci v=new Calci();
		v.get();
		v.calculate();
	}
	
}