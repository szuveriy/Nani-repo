package Demoo;

public class Demo1 {
	
	public  String name;
	private double sal;
	 
	public Demo1(String NAME) {
		name = NAME;
	}
	public void setSalary(double Sal) {
		sal =Sal;
	}
	public void first() {
		System.out.println(name);
  System.out.println(sal);
	}
	
	public static void main(String[] args) {
	
       Demo1 empNo = Demo1("rashmika");
       empNo.setSalary(1000);
       empNo.first();
	}

}


 