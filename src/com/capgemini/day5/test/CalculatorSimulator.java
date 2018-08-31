package com.capgemini.day5.test;

public class CalculatorSimulator {

	public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		TaxCalculator tc=new TaxCalculator();
		double tax=tc.calculateTax(null,true,55000);
		System.out.println(tax);

	}

}
