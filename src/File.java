import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
	
   void copyfile() throws IOException
   {
	   FileOutputStream out=null;
	   FileInputStream in=null;
	   try
	   {
		   in=new FileInputStream("a.txt");
		   out=new FileOutputStream("b.txt");
		  
		   int c;
		   while((c=in.read())!=-1)
		   {
			   out.write(c);
		   }
	   }finally
	   {
		   if(in!=null)
		   {
			   in.close(); 
		   }
		   if(out!= null)
		   {
		  	   out.close();
		   }
	   }
	   
   }
}
