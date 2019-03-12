package CRUD;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Employee implements Information{
		
		private String name;
		private String designation;
		private String organization;
		private String salary;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getOrganization() {
			return organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}
		public Employee(String name, String designation, String organization, String salary) {
			super();
			this.name = name;
			this.designation = designation;
			this.organization = organization;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Information [name=" + name + ", designation=" + designation + ", organization=" + organization
					+ ", salary=" + salary + "]";
		}

		public String add(String n, String d,String o, String s) {
			 String path ="C:/Users/aiswarja.saha/Desktop/File";
			 File file =new File(path);
			 
			 file.mkdir();
			 
			 String path1 = file.getAbsolutePath();
			 
			 System.out.println(path1);
			 
			 FileWriter textFile;
			try {
				textFile = new FileWriter(path1+"/Record.txt",true);
				 BufferedWriter bw = new BufferedWriter(textFile);
				    bw.write("Employee");
				    bw.newLine();
				    bw.write("Name:" +n);
				    bw.write("      ");
				    bw.write("Designation:" +d);
				    bw.write("      ");
				    bw.write("Organization:" +o);
				    bw.write("      ");
				    bw.write("Salary:" +s);
				    bw.newLine();
				    bw.close();
				    
				    BufferedReader br = new BufferedReader(new FileReader("C:/Users/aiswarja.saha/Desktop/File/Record.txt")); 
				    
				    String st; 
				    while ((st = br.readLine()) != null) 
				      System.out.println(st); 
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return path1;
			 
					   
		}
		
		public String Remove() {
			// TODO Auto-generated method stub
			return null;
		}

		public String Search() {
			 //error
		     /* try {
		    	  BufferedReader br = new BufferedReader(new FileReader("C:/Users/aiswarja.saha/Desktop/File/Record.txt")); 
		 		 String s;
		 		 String[] words=null;
		 		 String search="Joyee";
		 		 int count=0;   //Intialize the word to zero
				while(( s=br.readLine())!=null)   //Reading Content from the file
				  {
				     words=s.split(" ");  //Split the word using space
				      for (String word : words) 
				      {
				             if (word.equals(search))   //Search for the given word
				             {
				               count++;    //If Present increase the count by one
				             }
				      }
				  }
				if(count!=0)  //Check for count not equal to zero
			      {
			         System.out.println("The given word is present for "+count+ " Times in the file");
			      }
			      else
			      {
			         return "";
			      }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		*/ 
			return null;
		      
		   }
		

		public String Update() {
			// TODO Auto-generated method stub
			return null;
		}

	}

