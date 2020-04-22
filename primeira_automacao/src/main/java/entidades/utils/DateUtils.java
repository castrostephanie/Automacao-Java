package entidades.utils;

import java.sql.Date;
import java.util.Calendar;

public class DateUtils {
	
	public static Date obterDataDiferencaDias(int dias) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, dias);
		return (Date) cal.getTime();
}

}