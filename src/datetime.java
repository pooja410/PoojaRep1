import java.text.SimpleDateFormat;
import java.util.Date;

public class datetime {
	
	void getcurrenttime()
	{
		Date dt=new Date();
		String timeformate= "hh:mm:ss a";
		SimpleDateFormat tym=new SimpleDateFormat(timeformate);
		/// second commit
		System.out.println("Current time: "+tym.format(dt));
	}

}
