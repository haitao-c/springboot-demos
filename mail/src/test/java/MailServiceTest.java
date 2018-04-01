import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import demo.service.MailService;
import demo.StartUpApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= StartUpApplication.class)
public class MailServiceTest {
	@Autowired
	MailService mailService;

	private String to = "547149484@qq.com";

	@Test
	public void testSend(){
		mailService.sendSimpleMail(to,"主题：测试","hhhhhhhh");
	}


}
