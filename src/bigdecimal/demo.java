package bigdecimal;


import java.math.BigDecimal;
import java.text.DecimalFormat;


/**
 * Created by lyq on 2019/9/25.
 */
public class demo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(75000);
        BigDecimal b = new BigDecimal(74999);
        BigDecimal c = new BigDecimal(75001);

        //比较大小
        System.out.println(new BigDecimal(75000).compareTo(new BigDecimal(75000)) > -1);
        System.out.println(new BigDecimal(75000).compareTo(c) <0);
        //被除数为0
        System.out.println(BigDecimal.ZERO.divide(new BigDecimal(900),2,BigDecimal.ROUND_HALF_UP));

    }

    /**
     * bigdecimal 的千分符
     */
    public void qianFenFu() {
        //千分符
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        System.out.println(df1.format(1234567.126)); //"1,234,567.12"
    }
}
