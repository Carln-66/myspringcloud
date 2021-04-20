import java.time.ZonedDateTime;

/**
 * @Auther: Carl
 * @Date: 2021/04/20/14:10
 * @Description:
 */
public class CurrentTimeTest {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();    //默认时区
        System.out.println(zdt);
    }
}
