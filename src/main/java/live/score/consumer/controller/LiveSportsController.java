package live.score.consumer.controller;

import live.score.consumer.model.LiveSportsResponse;
import live.score.consumer.service.LiveSportsOddService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/live")
public class LiveSportsController {
    private final LiveSportsOddService liveSportsOddService;

    @GetMapping("/sports")
    public ResponseEntity<List<LiveSportsResponse>> getLiveSports(){
        return ResponseEntity.ok(liveSportsOddService.getActiveLiveSports());
    }
}
