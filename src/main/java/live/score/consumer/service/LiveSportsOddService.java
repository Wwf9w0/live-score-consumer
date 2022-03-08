package live.score.consumer.service;

import live.score.consumer.client.RapidApiClient;
import live.score.consumer.configuration.RapidApiProperties;
import live.score.consumer.model.LiveSportsEntity;
import live.score.consumer.model.LiveSportsResponse;
import live.score.consumer.model.converter.LiveSportsConverter;
import live.score.consumer.repository.LiveSportsResository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LiveSportsOddService {

    private final LiveSportsResository liveSportsResository;
    private final RapidApiClient rapidApiClient;
    private final RapidApiProperties rapidApiProperties;
    private final LiveSportsConverter liveSportsConverter;

    public List<LiveSportsResponse> getActiveLiveSports(){
       List<LiveSportsResponse> responseLiveSports = getLiveSports();
        log.info("Get live sports : {}", responseLiveSports);
        save();
        log.info("Saved live sports");
        return responseLiveSports;
    }

    public LiveSportsEntity save(){
        List<LiveSportsResponse> liveSportsResponseList = getActiveLiveSports();
        return liveSportsResository.save(liveSportsConverter.toLiveSportsEntity((LiveSportsResponse) liveSportsResponseList));
    }


    public List<LiveSportsResponse> getLiveSports(){
        ResponseEntity<List<LiveSportsResponse>> response = rapidApiClient.
                getAllLiveSportsOdd(rapidApiProperties.getHost(), rapidApiProperties.getApiKey());
        return response.getBody();
    }
}
