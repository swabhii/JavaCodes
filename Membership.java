import java.util.*;
class Members
{
	String name;
	int membership_id;
	int fees;
	int age;

	Scanner s=new scanner(System.in);
	public void addMember()
	{
		name=s.next();
		age=s.nextInt();

	}
}
class Monthly extends Members
{	//int m_fees;
	public void monthFees(int x)
	{
		fees=x;
		System.out.println("Monthly membership fees  is "+fees);
		System.out.println("Deatils of the member:");
		System.out.println("Name - "+name+"\nAge - "+age);

	}



}
class Annual extends Members
{
	//int a_fees;
	public void yearFees(int x)
	{
		fees=x;
		System.out.println("Annual membership fees  is "+fees);
		System.out.println("Details of the member:");
		System.out.println("Name - "+name+"\nAge - "+age);
	}

}
class Permanent extends Members
{	
	//int p_fees;
	public void permanentFees(int x)
	{
		fees=x;
		System.out.println("Lifetime membership fees  is "+fees);
		System.out.println("Details of the member:");
		System.out.println("Name - "+name+"\nAge - "+age);
	}

}
class Manager extends Members
{
	public void register()
	{


	}
}
class Membership
{
	 public static void main(String[] args) {
	 	Members obj=new Members();
	 	obj.addMember();
	 	char choice;
	 	Scanner s=new Scanner(System.in);
	 	System.out.print("Choose 'm' for monthly membership, 'a' for annual membership and 'p' for permament membership");
	 	choice=s.next().CharAt(0);
	 	if(choice=='m')
	 		obj.monthFees(200);
	 	else if(choice=='a')
	 		obj.yearFees(500);
	 	else if(choice=='p')
	 		obj.permanentFees(1000);
	 	else
	 		System.out.println("Wrong input");








		
	}
}