package excel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cal {

	public static String getDate() {
		
			SimpleDateFormat formatter=new SimpleDateFormat("MMddYY_hhmmss");
			String x = formatter.format(new Date());
			return x;
			
			
			//System.out.println(formatter.format(new Date()));

	}

}
