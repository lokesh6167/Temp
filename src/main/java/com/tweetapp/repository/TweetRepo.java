package com.tweetapp.repository;

import com.tweetapp.model.Tweet;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
@Repository
public interface TweetRepo extends PagingAndSortingRepository<Tweet,String> {
    // @Query("{'username': ?0}")
    List<Tweet> findTweetsByUsername(String username);

    // @Query("{'_id':?0}")
    Tweet findByTweetId(String tweetId);
}
