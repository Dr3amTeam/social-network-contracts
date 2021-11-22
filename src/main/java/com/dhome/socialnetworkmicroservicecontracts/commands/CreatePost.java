package com.dhome.socialnetworkmicroservicecontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class CreatePost {
    @TargetAggregateIdentifier
    private String postId;
    private String description;
    private Date createdDate;
    private String employeeId;
}
