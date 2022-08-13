package project;

public class DemoOverLoad
{
   public static void main(String[] args) 
   {
	int month = 6;
	int day = 24;
	int year = 2019;
	displayDate(month);
	displayDate(month,day);
	displayDate(month,day,year);
   }
   public static void displayDate(int mm)
   {
	   System.out.println("Even date "+ mm + "/1/2018");
   }
   public static void displayDate(int mm, int dd)
   {
	   System.out.println("Even date "+ mm +"/" + dd + "/" +"2018");
   }
   public static void displayDate(int mm, int dd, int yy)
   {
	   System.out.println("Even date "+ mm + "/" + dd + "/" + yy);
   }
}
