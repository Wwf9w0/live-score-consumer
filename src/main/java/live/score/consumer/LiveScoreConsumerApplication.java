package live.score.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LiveScoreConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveScoreConsumerApplication.class, args);
	}

}
