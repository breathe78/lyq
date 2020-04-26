package bigdecimal;

import Common.CommonUtils;
import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;

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

    }

    /**
     * bigdecimal 的千分符
     */
    public void qiFenFu() {
        //千分符
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        System.out.println(df1.format(1234567.126)); //"1,234,567.12"
    }
}
