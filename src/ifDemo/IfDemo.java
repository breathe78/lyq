package ifDemo;

/**
 * Created by lyq on 2019/10/23.
 */
public class IfDemo {
    public static void main(String[] args) {
        int score = 90;

/**
 *         if( 条件 语句)
 *         {
 *         代码 块
 *         }
 */
//        if (score >= 60) {
//            System.out.println("分数 - 及格");
//        }
/**
 *         if( 判断 条件)
 *         {
 *         代码 块 1
 *         }else{
 *         代码 块 2
 *         }
 */
//        if (score >= 60) {
//            System.out.println("分数 - 及格");
//        } else {
//            System.out.println("分数 - 不及格");
//        }

/**
 *          if( 条件 1)
 *          { 代码 块 1
 *          }else if( 条件 2){
 *          代码 块 2
 *          } …
 *          else if( 条件 n){
 *          代码 块 n
 *          }else{
 *          代码 块 n+ 1
 *          }
 *
 *          if/ else if/ else 陷阱： 需要注意的是，在 if/ else if/ else 中，判断的顺序是很重要的，后面的判断只有在前面的条件为false的时候才会执行。
 */
        if (score >= 60) {
            System.out.println("分数 - 及格");
        } else if (score >= 80) {
            System.out.println("分数 - 良好");
        } else{
            System.out.println("分数 - 优秀");
        }

    }
}
