package com.dhome.socialnetworkmicroservicecontracts.events;

import lombok.Value;

import java.util.Date;

@Value
public class PostCreated {
    private String postId;
    private String videoUrl;
    private String content;
    private Date uploadDate;
    private String employeeId;
}
