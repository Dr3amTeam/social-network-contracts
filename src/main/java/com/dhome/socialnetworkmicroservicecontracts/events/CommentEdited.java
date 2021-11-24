package com.dhome.socialnetworkmicroservicecontracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CommentEdited {
    private String commentId;
    private String text;
    private String postId;
    private Instant occurredOn;
}
