package com.dhome.socialnetworkmicroservicecontracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CommentCreated {
    private String commentId;
    private String message;
    private String postId;
    private Instant occuredOn;
}
