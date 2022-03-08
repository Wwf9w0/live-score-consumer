package live.score.consumer.client;

import live.score.consumer.model.LiveSportsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "rapidapi", url = "${rapidapi.url}")
public interface RapidApiClient {

    @GetMapping("/matches/v2/list-live?Category=soccer")
    ResponseEntity<String> getLiveList(@RequestHeader(name = "x-rapidapi-host") String host,
                                      @RequestHeader(name = "x-rapidapi-key") String key);

    @GetMapping("leagues/v2/list?Category=soccer")
    ResponseEntity<String> getLeagueList(@RequestHeader(name = "x-rapidapi-host") String host,
                         @RequestHeader(name = "x-rapidapi-key") String key);

    @GetMapping
    ResponseEntity<List<LiveSportsResponse>> getAllLiveSportsOdd(@RequestHeader(name = "x-rapidapi-host") String host,
                                                                @RequestHeader(name = "x-rapidapi-key") String apiKey);
}
