package numbers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simpledate {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String format=sdf.format(d);
        System.out.println(format);
	}

}
