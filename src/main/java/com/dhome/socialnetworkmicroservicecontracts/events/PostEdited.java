package com.dhome.socialnetworkmicroservicecontracts.events;


import lombok.Value;

import java.time.Instant;
import java.util.Date;

@Value
public class PostEdited {
    private String postId;
    private String description;
    private Date createdDate;
    private String employeeId;
    private Instant occuredOn;
}
