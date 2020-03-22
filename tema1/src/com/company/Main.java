package com.company;

public class Main {

    public static void main(String[] args) {
	Employee employeeTest=new Employee();
	employeeTest.setReligion("Crestin");
	System.out.println(employeeTest.getReligion());
	employeeTest.setSalary(1500);
	System.out.println(employeeTest.getSalary());
    }
}
