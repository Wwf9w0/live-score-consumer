package live.score.consumer.repository;

import live.score.consumer.model.LiveSportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiveSportsResository extends JpaRepository<LiveSportsEntity, Long> {
}
