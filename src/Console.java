import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	
	void read() throws IOException
	{
		InputStreamReader in=null;
		try
		{
			in=new InputStreamReader(System.in);
			char c;
			System.out.println("if u want to exit then type 'E'");
			do
			{
				c=(char)in.read();
				System.out.println(c);
			}while(c!='E');
		}
		finally
		{
			if(in != null)
				in.close();
		}
	}

}
