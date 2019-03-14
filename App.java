package CRUD;


	public class App {

		public static void main(String[] args) {
		
			Employee E1=new Employee("Joye","Manager","Abc","12000");
			E1.add(E1.getName(),E1.getDesignation(),E1.getOrganization(),E1.getSalary());

			Employee E2=new Employee("Aiswarja","Accountant","Naztech","15000");
			E2.add(E2.getName(),E2.getDesignation(),E2.getOrganization(),E2.getSalary());
			
			Employee E3=new Employee("Saha","Developer","Tech","17000");
			E3.add(E3.getName(),E3.getDesignation(),E3.getOrganization(),E3.getSalary());
			
			Employee E4=new Employee("Rimi","Developer","Technoheaven","13000");
			
			//switch()
			E1.Search();
		}

	}

