import com.aoptest.config.AppConfig;
import com.aoptest.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) applicationContext.getBean("test");
        user.say1();
        user.say2();
        user.say3();
        user.say4();
        user.say5();
    }


}
