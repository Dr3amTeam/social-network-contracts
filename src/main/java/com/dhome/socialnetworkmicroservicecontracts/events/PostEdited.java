package com.dhome.socialnetworkmicroservicecontracts.events;

import lombok.Value;

import java.time.Instant;
import java.util.Date;

@Value
public class PostEdited {
    private String postId;
    private String videoUrl;
    private String content;
    private Date uploadDate;
    private String employeeId;
    private Instant occurredOn;
}
