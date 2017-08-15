import org.apache.log4j.Logger;
import org.crazyit.app.domain.User;
import org.crazyit.app.service.UserManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {  
            "classpath:applicationContext.xml"  
})  
public class TestUserManager {  
    private static final Logger LOGGER = Logger.getLogger(TestUserManager.class);  
    @Autowired  
    UserManager userManager;  
      
    @Test  
    public void save() {  
        /*User user = new User();  
        user.setUserName("fengwusan");  
        user.setPassword("123456");  
        user.setGender(0);  
        Integer id = userManager.save(user); */ 
    	User u = userManager.get(1);
       System.out.println(JSON.toJSONString(u));  
    }  
}  
