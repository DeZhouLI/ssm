package ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lidezhou.pojo.User;
import com.lidezhou.service.UserService;

import junit.framework.TestCase;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class testDAO extends TestCase {

	@Autowired
	UserService userService;

	@Test
	public void getUserByIdTest() {
		User user = new User();
		user.setName("lidezhou");
		userService.insert(user);
	}

}
