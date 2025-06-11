package basic.code.java;

 class Person{//parent class
	
	protected String name;

	Person(String name){
		//set value 
		this.name=name;
	}

	void Display() {
		System.out.println("Name:"+name);	
	}
}
 
 class Employee extends Person{
	 String employeid;
	 double hrsperpay;
	 int hrswk;
	
	 Employee(String name,String employeid,double hrsperpay,int hrswk){
		 super(name);//inherit from parent class
		 //set values
		 this.employeid=employeid;
		 this.hrsperpay=hrsperpay;
		 this.hrswk=hrswk;
		 
	 }
	 
	 double Calculation() {
		 return hrsperpay * hrswk;
	 }
	 
	 void Displaydetails() {
		 super.Display();
		 System.out.println("Employe ID:"+employeid);
		 System.out.println("Salary of the Employee:"+Calculation());
	 }
	 
 }


public class SalaryCalculation { //main class

		public static void main(String[] args) {
			Employee em = new Employee("Angel","a06",8.0,650);
			em.Displaydetails();
	
	}
}
