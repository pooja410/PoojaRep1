
public class exception 
{
	
	int x,y;
	void getdata(int a,int b)
	{
		x=a;
		y=b;
	}
	void cal() throws Exception
	{
		int result=0;
		try{
			
			if(x>y)
			{
				result=x-y;
			}
			else
			{ 
				throw new Exception();
			}
			System.out.println("Result :" + result);
		}
		catch(Exception e)
		{
			System.out.println("a is less than b");
		}
	}

}