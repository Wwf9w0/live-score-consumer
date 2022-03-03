package live.score.consumer.controller;

import live.score.consumer.service.LeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("league")
public class LeagueController {
    private final LeagueService leagueService;

    @GetMapping
    public ResponseEntity<String> getLeagueList(){
        return ResponseEntity.ok(leagueService.getLeagueList());
    }
}
