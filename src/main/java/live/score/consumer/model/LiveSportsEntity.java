package live.score.consumer.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "live")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LiveSportsEntity {

    @Id
    public Long id;

    public String key;
    public String group;
    public String title;
    public String description;
    public Boolean isActive;
    public Boolean has_outrights;
}
