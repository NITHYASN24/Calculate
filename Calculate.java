package week1.day2;

public class Calculate {

	public double sub (double x, double y) {

return x-y;
	}
public int add (int x, int y) {

return x+y;
	}	
public double prod (double x, double y) {

return x*y;}

public int div (int x, int y) 
{

return x/y;
}

	public static void main(String[] args) {
		
		Calculate value = new Calculate();
	double sub = value.sub(20.50,10.20);
		System.out.println(sub);
	int add = value.add(20,30);
		System.out.println(add);
    double  prod =  value.prod(10.5,20.5);
       System.out.println(prod);
		int div = value.div(20,10);
	System.out.println(div);
	}
}
 