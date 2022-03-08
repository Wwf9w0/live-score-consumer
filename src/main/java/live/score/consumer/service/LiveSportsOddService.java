package live.score.consumer.service;

import live.score.consumer.client.RapidApiClient;
import live.score.consumer.configuration.RapidApiProperties;
import live.score.consumer.model.LiveSportsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LiveSportsOddService {
    private final RapidApiClient rapidApiClient;
    private final RapidApiProperties rapidApiProperties;

    public List<LiveSportsResponse> getActiveLiveSports(){
        ResponseEntity<List<LiveSportsResponse>> response = rapidApiClient.getAllLiveSportsOdd(rapidApiProperties.getHost(), rapidApiProperties.getApiKey());
        log.info("Get live sports : {}", response.getBody());
        return response.getBody();
    }
}
