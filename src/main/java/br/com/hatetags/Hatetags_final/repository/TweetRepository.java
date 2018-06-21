package br.com.hatetags.Hatetags_final.repository;

import br.com.hatetags.Hatetags_final.models.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    @Query(value = "SELECT * FROM tweet WHERE tweet.id > :lastId LIMIT 24", nativeQuery = true)
    List<Tweet> findTwentyFive(@Param("lastId") Long id);
}
