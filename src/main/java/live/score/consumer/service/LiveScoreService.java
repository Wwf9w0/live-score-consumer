package live.score.consumer.service;

import live.score.consumer.client.RapidApiClient;
import live.score.consumer.configuration.RapidApiProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LiveScoreService {
    private final RapidApiClient rapidApiClient;
    private final RapidApiProperties rapidApiProperties;

    public String getLiveScoreList(){
        ResponseEntity<String> response = rapidApiClient.getLiveList(rapidApiProperties.getHost(), rapidApiProperties.getApiKey());
        log.info("Getting live score list : {}", response);
        return response.getBody();
    }
}
