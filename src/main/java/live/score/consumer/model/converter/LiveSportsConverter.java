package live.score.consumer.model.converter;


import live.score.consumer.model.LiveSportsEntity;
import live.score.consumer.model.LiveSportsResponse;

public class LiveSportsConverter {

    public static LiveSportsEntity toLiveSportsEntity(LiveSportsResponse liveSportsResponse){
        return LiveSportsEntity.builder()
                .key(liveSportsResponse.getKey())
                .group(liveSportsResponse.getGroup())
                .title(liveSportsResponse.getTitle())
                .description(liveSportsResponse.getDescription())
                .isActive(liveSportsResponse.getIsActive())
                .has_outrights(liveSportsResponse.getHas_outrights())
                .build();
    }
}
