package Generic.java1;

import Generic.Order;
import Generic.SubOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyq on 2019/10/29.
 */
public class DAOtest {
    public static void main(String[] args) {
        DAO<String> dao = new DAO<>();
        dao.getValue("1") ;

    }
}
