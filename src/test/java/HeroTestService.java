import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.Hero;
import com.bw.service.HeroServiceImpl;

public class HeroTestService {
	@Test
	public void TestList(){
ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HeroServiceImpl bean = ac.getBean("heroServiceImpl",HeroServiceImpl.class);
		
		Map<String, Object> map = new HashMap<>();
		List<Hero> list = bean.queryAll(map);
		
		for (Hero hero : list) {
			System.out.println(hero);
		}
	}


}
