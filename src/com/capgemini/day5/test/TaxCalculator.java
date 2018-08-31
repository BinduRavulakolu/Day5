package com.capgemini.day5.test;
import com.capgemini.day5.test.CountryNotValidException;
import com.capgemini.day5.test.TaxNotEligibleException;
import com.capgemini.day5.test.EmployeeNameInvalidException;
public class TaxCalculator {
	public TaxCalculator() {
		super();
	}
	public double calculateTax(String employeeName,boolean isIndian,double employeeSalary) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		if(isIndian==false) 
		{
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		else if(employeeName==null&&employeeName=="")
		{
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		else if(employeeSalary>100000)
		{
			return ((employeeSalary*8)/100);
		}
		else if(employeeSalary>50000&&employeeSalary<=100000)
		{
			return ((employeeSalary*6)/100);
		}
		else if(employeeSalary>30000&&employeeSalary<=50000)
		{
			return ((employeeSalary*5)/100);
		}
		else if(employeeSalary>10000&&employeeSalary<=30000)
		{
			return ((employeeSalary*4)/100);
		}
		else 
		{
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
	
	}

}
