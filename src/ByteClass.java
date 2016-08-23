import java.io.*;

public class ByteClass {
	
	void oopbyte()
	{
		
		try {
			 byte bwrite[]={'P','O','O','J','A'};
			 OutputStream out=new FileOutputStream("text.txt");
			 
			 for(int x=0;x<bwrite.length;x++)
			     out.write(bwrite[x]);
			 
			 out.close();
			 InputStream in= new FileInputStream("text.txt");
			 int count= in.available();
			 
			 for (int i = 0; i < count; i++) 
			 {
				 System.out.print((char)in.read());
		   	 }
			 in.close();
			 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception");
				e.printStackTrace();
			}
		
	}

}
