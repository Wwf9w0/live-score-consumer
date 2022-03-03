package live.score.consumer.service;

import live.score.consumer.client.RapidApiClient;
import live.score.consumer.configuration.RapidApiProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class LeagueService {
    private final RapidApiClient rapidApiClient;
    private final RapidApiProperties rapidApiProperties;

    public String getLeagueList(){
        ResponseEntity<String> leagueListResponse = rapidApiClient.getLeagueList(rapidApiProperties.getHost(), rapidApiProperties.getApiKey());
        log.info("Getting league list : {}", leagueListResponse);
        return leagueListResponse.getBody();
    }
}
