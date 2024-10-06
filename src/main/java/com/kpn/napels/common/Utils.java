package com.kpn.napels.common;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

public class Utils {
	
	private static final String BLANK = "";
	
	public static boolean isNullOrEmpty(String string) {
		System.out.println("string:"+string);
		if(string==null || string.equals("") || string.isEmpty()||string.equalsIgnoreCase("null")){
		    return true;
		}
		return false;		
	 }
	
	public static boolean isEmptyOrNull(Object object) {		
		if (object == null) {
	        return true;
	    }
	    return false;
	}
	
	public static <T> boolean IsNullOrEmpty(Collection<T> list) {
		   if( list == null || list.isEmpty())
			   return true;
		   return false;
		}
	
	public static boolean isNullOrZero(Integer i){
	    return 0 == ( i == null ? 0 : i);
	}
	
	//-----This Method() is for getting SystemDate in CET TimeZone    
	public static Date getSystemDateTimeinCET() {
		try {
			Date systemDate = new Date();
			
			DateFormat gmtFormat1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			TimeZone cetTime = TimeZone.getTimeZone("CET");
			gmtFormat1.setTimeZone(cetTime);  
			
			String systemDateCETString=gmtFormat1.format(systemDate);
			
			DateFormat gmtFormat2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Date systemDateCET=gmtFormat2.parse(systemDateCETString);
			
		
			return systemDateCET;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
		}
	
	public static String getDateInStringFormat(Date date, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String strDate = formatter.format(date);
		return strDate;
	}
	
	/**THIS METHOD IS FOR CHECKING NULL STRING and BLANK STRING*/
	public static String checkNullOrReturnBalnk(String paramanter) {
		if(paramanter==null || paramanter.equals(BLANK) || paramanter.isEmpty()|| paramanter.equalsIgnoreCase("null")){
		    return BLANK;
		}
		return paramanter;
	}
	
	
}
