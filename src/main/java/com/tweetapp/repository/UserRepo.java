package com.tweetapp.repository;

import com.tweetapp.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface UserRepo extends PagingAndSortingRepository<User,String> {
    // @Query("{'userName': ?0, 'password': ?1}")
    User findUserByUserNameAndPassword(String username, String password);

    // @Query("{'_id': ?0}")
    User findUserByUserId(String userId);

}
