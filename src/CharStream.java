import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream
{
	
	void readwrite() throws IOException
	{
		FileReader r=null;
		FileWriter w= null;
		
		try
		{
		   r=new FileReader("a.txt");
		   w= new FileWriter("c.txt");
		   
		   int c;
		   while((c=r.read())!= -1)
		   {
			   w.write(c);
		   }
		   
		}
		finally
		{
			if(r!=null || w != null)
			{
				r.close();
				w.close();
			}	
		}
	}

}
