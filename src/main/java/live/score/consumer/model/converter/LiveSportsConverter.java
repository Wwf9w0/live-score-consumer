package live.score.consumer.model.converter;


import live.score.consumer.model.LiveSportsEntity;
import live.score.consumer.model.LiveSportsResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LiveSportsConverter {

    public static LiveSportsEntity toLiveSportsEntity(LiveSportsResponse liveSportsResponse){

        return LiveSportsEntity.builder()
                .id(Long.parseLong(UUID.randomUUID().toString()))
                .key(liveSportsResponse.getKey())
                .group(liveSportsResponse.getGroup())
                .title(liveSportsResponse.getTitle())
                .description(liveSportsResponse.getDescription())
                .isActive(liveSportsResponse.getIsActive())
                .has_outrights(liveSportsResponse.getHas_outrights())
                .build();
    }
}
