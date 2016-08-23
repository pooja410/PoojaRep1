
public class Constructor {
	
	int a;
	String b;
	public Constructor() 
	{
	   a= 0;
	   b= null;
	}
	Constructor (int x, String y)
	{
		a=x;
		b=y;
	}
	public void put()
	{
		System.out.println(a+" "+b);
	}

}
