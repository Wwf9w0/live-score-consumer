package live.score.consumer.model;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "live_sports")
@Builder
@RequiredArgsConstructor
public class LiveSportsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String key;
    public String group;
    public String title;
    public String description;
    public Boolean isActive;
    public Boolean has_outrights;
}
