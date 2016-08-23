import java.text.SimpleDateFormat;
import java.util.Date;

public class datetime {
	
	@SuppressWarnings("deprecation")
	void getcurrenttime()
	{
		Date dt=new Date();
		String timeformate= "hh:mm:ss a";
		SimpleDateFormat tym=new SimpleDateFormat(timeformate);
		
		System.out.println("Current time: "+dt.+" "+tym.format(dt));
	}

}
