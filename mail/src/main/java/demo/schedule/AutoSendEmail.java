package demo.schedule;

import demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutoSendEmail {

	@Autowired
	private MailService mailService;

	@Scheduled(fixedRate = 1000)
	public void autoSend(){
		mailService.sendSimpleMail("547149484@qq.com","test","autosSend");
	}
}
