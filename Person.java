package com.javaprograms;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getlastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setAge(int age) {
		this.age=age;
		if(age<0 || age>100) {
			age=0;
		}
	}
	
	public boolean isTeen() {
		boolean result=false;
		if(age>12 && age<20) {
			result=true;
		}
		else {
			result=false;
		}
		return result;
	}
	
	public String getFullName() {
		String result="";
		if(this.firstName.isEmpty()==true && this.lastName.isEmpty()==true) {
			result="";
		}
		else if(this.lastName.isEmpty()==true && this.firstName.isEmpty()==false) {
			result=this.firstName;
		}
		else if(this.firstName.isEmpty()==true && this.lastName.isEmpty()==false) {
			result=this.lastName;
		}
		else {
			result=this.firstName+" "+this.lastName;
		}
		return result;
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirstName("");
		person.setlastName("");
		person.setAge(10);
		System.out.println("fullName= "+person.getFullName());
		System.out.println("teen= "+person.isTeen());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("fullName= "+person.getFullName());
		System.out.println("teen= "+person.isTeen());
		person.setlastName("Smith");
		System.out.println("fullName= "+person.getFullName());

	}

}
