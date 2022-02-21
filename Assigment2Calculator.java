package Week1.day2;

public class Assigment2Calculator {

	public static void main(String[] args) {
		
		Assigment2Calculator cal = new Assigment2Calculator();
		cal.Add();
		cal.sub();
		cal.mul();
		cal.divide();
	}
    public void Add() {
int num1=1,num2=2,num3=3,a;
a=num1+num2+num3;
System.out.print("The sum of three integers is"+" "+a);
}
    public void sub() {
    	int num1=5,num2=2,s;
    	s=num1-num2;
    	System.out.print("The sum of three integers is"+" " +s);
    	}
    
    public void mul()
    {
    	int num1=8,num2=8,m;
    	m=num1*num2;
    	System.out.print("The sum of three integers is" +" "+m);
    	}
    public void divide()
    {
    	float num1=8,num2=8,d;
    	d=num1/num2;
    	System.out.print("The sum of three integers"+d);
    	}
    
    }


