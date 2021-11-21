package com.dhome.socialnetworkmicroservicecontracts.events;

import lombok.Value;

@Value
public class CommentCreated {
    private String commentId;
    private String text;
    private String commenterId;
    private String postId;
}
