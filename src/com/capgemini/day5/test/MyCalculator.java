package com.capgemini.day5.test;

public class MyCalculator {
    int number;
	int power;

	public MyCalculator() {
     super();
	};
     MyCalculator( int number, int power)
	{
	    this.number=number;
		this.power=power;
		
	};
	public long power() throws Exception,Exception
	{
		int result=number;
		if(number>0&&power>0)
		{
		for(int i=1;i<power;i++)
		{
		result=result*number;
		}
		return result;
		}
		else
		{
			if(number<0||power<0)
			{
				throw new Exception("n and p should not be negative");
			}
			else
			{
			throw new Exception("n or p should not be zero");
			}
		}
	}
		

}
