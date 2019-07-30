package industry;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMenu {
//declare the list for store the Employee Details Array
	ArrayList<String[]> EmployeeData = new ArrayList<String[]>(100);

	public void Menu() {
		int options;
		Scanner scan = new Scanner(System.in);
		loop: do {
			System.out.println("MENU");
			System.out.println(" 1. Create Employee\n 2. Fetch Employee\n 3. Delete\n 4.search\n 5. Logout");
			System.out.println("Choose the options");
			options = scan.nextInt();
//switch case for the choose the operation
			switch (options) {
			case 1:
				EmpCreate createEmp = new EmpCreate();
				EmployeeData.addAll(createEmp.PersonalDetails());
				break;
			case 2:
				EmpFetch fetch = new EmpFetch();
				fetch.empFetch(EmployeeData);
				break;
			case 3:
				EmpDelete delete = new EmpDelete();
				delete.delete(EmployeeData);
				break;
			case 4:System.out.println(" 1. All Employee\n 2. Fetch Employee\n ");
										System.out.println("Choose the options");
										int id1 = scan.nextInt();
				EmpSearch search = new EmpSearch();
				switch (id1) {
				case 1:
					System.out.println("Search Employee Details through id");

					int id = scan.nextInt();

					EmpSearch search1 = new EmpSearch();
					search1.find();
					break;
				case 2:

					System.out.println("Enter the Designation to find the Employee's");
					String Designation = scan.next();
					search.Search(EmployeeData, Designation);
					break;
				}
				break;
			case 5:
				System.out.println("Logout successfully");
				break loop;
			}
		} while (true);
		Login log = new Login();
		log.login();
	}
}
