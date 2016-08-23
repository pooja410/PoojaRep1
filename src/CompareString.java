
public class CompareString {
	
	
	String str1= "Pooja";
	String str2="pooja";
	
    void stringcompare()
    {
    	int flag1= str1.compareTo(str2);
    	System.out.println(flag1);
    	
    	
    	int flag2=str1.compareToIgnoreCase(str2);
    	System.out.println(flag2);
    	
    }

}
