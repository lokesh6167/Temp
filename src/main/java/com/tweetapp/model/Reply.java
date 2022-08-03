package com.tweetapp.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="Reply")
public class Reply {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String replyId;

    @DynamoDBAttribute
    private String replyContent;

    @DynamoDBAttribute
    private String replyPostTime;

    @DynamoDBAttribute
    private String tweetId;

    @DynamoDBAttribute
    private String username;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyPostTime() {
        return replyPostTime;
    }

    public void setReplyPostTime(String replyPostTime) {
        this.replyPostTime = replyPostTime;
    }

    public String getTweetId() {
        return tweetId;
    }

    public void setTweetId(String tweetId) {
        this.tweetId = tweetId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}