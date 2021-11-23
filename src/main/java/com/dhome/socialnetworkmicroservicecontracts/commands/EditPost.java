package com.dhome.socialnetworkmicroservicecontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class EditPost {
    @TargetAggregateIdentifier
    private String postId;
    private String videoUrl;
    private String content;
    private Date uploadDate;
    private String employeeId;
}
