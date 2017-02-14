package INTERFACE;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GET_DATE {

	   public static String  current_date(){
		    Calendar cal = new GregorianCalendar();
		    Date creationDate = cal.getTime();
		    SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy");
		    String s1=date_format.format(creationDate);
		    //System.out.println(s1);
		    return s1;
		  }
		  






}
