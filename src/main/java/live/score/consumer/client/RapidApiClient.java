package live.score.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "rapidapi", url = "${rapidapi.url}")
public interface RapidApiClient {

    @GetMapping("/matches/v2/list-live?Category=soccer")
    ResponseEntity<String> getLiveList(@RequestHeader(name = "x-rapidapi-host") String host,
                                      @RequestHeader(name = "x-rapidapi-key") String key);

    @GetMapping("leagues/v2/list?Category=soccer")
    ResponseEntity<String> getLeagueList(@RequestHeader(name = "x-rapidapi-host") String host,
                         @RequestHeader(name = "x-rapidapi-key") String key);
}
