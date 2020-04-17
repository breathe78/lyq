package Common;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonUtils {
    public static void main(String[] args) {
        System.out.println(parseNumber(new BigDecimal(0.501)));
    }
    public static String parseNumber(BigDecimal bd) {
        String pattern = "###,###.##";
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(bd);
    }
}
