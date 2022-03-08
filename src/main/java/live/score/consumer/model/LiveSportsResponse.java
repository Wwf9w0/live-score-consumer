package live.score.consumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LiveSportsResponse {

    @JsonProperty(value = "key")
    private String key;
    @JsonProperty(value = "group")
    private String group;
    @JsonProperty(value = "title")
    private String title;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "active")
    private Boolean active;
    @JsonProperty(value = "has_outrights")
    private Boolean has_outrights;

}
