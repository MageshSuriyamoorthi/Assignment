package industry;

	import java.awt.List;
	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class EmpCreate
	{
	protected int Empid;
	private int EmpAge;
	private String EmpName;
	private String EmpRole;
	private String EmpEligibility;
	private int BasicSal;
	Scanner sc = new Scanner(System.in);
	ArrayList<String[]> EmployeeData= new ArrayList<String[]>(100);
	public ArrayList<String[]> PersonalDetails()
	{
	System.out.println("Enter the Professional & Personal Details of Employee:");
	String[] Details = new String[6];
	
	for (int initial = 0; initial < Details.length; initial++)
	{
	if (initial == 0)
	{
	System.out.println("Enter the Employee_id:");
	Empid = sc.nextInt();
	Details[initial] = Integer.toString(Empid);
	}
	if (initial == 1) 
	{
	System.out.println("Enter the Employee_name:");
	EmpName = sc.next();
	Details[initial] = EmpName;
	}
	if (initial == 2)
	{
	System.out.println("Enter the Employee_age:");
	EmpAge = sc.nextInt();
	Details[initial] = Integer.toString(EmpAge);
	}
	if (initial == 3)
	{
	System.out.println("Enter the Designation:");
	EmpRole = sc.next();
	Details[initial] = EmpRole;
	}
	if (initial == 4) 
	{
	System.out.println("Enter the Skills of Employee:");
	EmpEligibility = sc.next();
	Details[initial] = EmpEligibility;
	}
	if (initial == 5)
	{
	System.out.println("Enter the Salary of Employee:");
	BasicSal = sc.nextInt();
	Details[initial] = Integer.toString(BasicSal);
	}
	}
	EmployeeData.add(Details);
	System.out.println("Employee Details Sucessfully Completed");
	return EmployeeData;

	}
	}

