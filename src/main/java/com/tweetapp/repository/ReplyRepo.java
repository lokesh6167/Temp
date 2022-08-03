package com.tweetapp.repository;

import com.tweetapp.model.Reply;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface ReplyRepo extends PagingAndSortingRepository<Reply,String> {
}
