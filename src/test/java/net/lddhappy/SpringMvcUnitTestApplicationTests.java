package net.lddhappy;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import net.lddhappy.config.CommonConfig;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import static junitparams.JUnitParamsRunner.*;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
@RunWith(JUnitParamsRunner.class)
@SpringBootTest
public class SpringMvcUnitTestApplicationTests {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
    //注意 SpringMethodRule是实例字段
    @Rule
    public final SpringMethodRule SPRING_METHOD_RULE = new SpringMethodRule();

    @Autowired
    private CommonConfig commonConfig;

    private Object[] getParams() {
        return $("haha", "wokao", "heihei");
    }

    @Test
    @Parameters(method = "getParams")
    public void contextLoads(String pa) {
        assertTrue(commonConfig.getAppVersion() != null && commonConfig.getAppVersion().length() > 0);
        System.out.println(pa);
    }

}
