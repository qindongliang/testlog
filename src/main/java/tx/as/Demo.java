package tx.as;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
static final Logger log = LogManager.getLogger(Demo.class);
    public static void main(String[] args) {
        System.out.println(123);
        log.info("123");
        System.out.println(123);
    }
}
