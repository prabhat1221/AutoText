package com.example.AutoText.autoschedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.AutoText.entity.ConstantsClass;
import com.example.AutoText.service.AlertService;

import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTasks {
	static  AlertService alertService = new AlertService();
	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    @Scheduled(cron = "* * * * * *")
    public void scheduleTaskWithCronExpression() throws URISyntaxException {
        logger.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
		alertService.post(ConstantsClass.BOT_URL, "Hi Bye from spring boot");
		//alertService.post(url, text)
    }
}
