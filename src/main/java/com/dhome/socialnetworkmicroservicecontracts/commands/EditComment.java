package com.dhome.socialnetworkmicroservicecontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class EditComment {
    @TargetAggregateIdentifier
    private String commentId;
    private String message;
    private String postId;
}
