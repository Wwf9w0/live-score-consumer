package live.score.consumer.controller;

import live.score.consumer.service.LiveScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/live")
public class LiveScoreController {
    private final LiveScoreService liveScoreService;

    @GetMapping()
    public ResponseEntity<String> getLiveScoreList(){
        return ResponseEntity.ok(liveScoreService.getLiveScoreList());
    }
}
