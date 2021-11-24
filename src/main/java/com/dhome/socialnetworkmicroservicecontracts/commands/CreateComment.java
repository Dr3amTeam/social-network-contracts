package com.dhome.socialnetworkmicroservicecontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class CreateComment {
    @TargetAggregateIdentifier
    private String commentId;
    private String text;
    private String postId;
}
