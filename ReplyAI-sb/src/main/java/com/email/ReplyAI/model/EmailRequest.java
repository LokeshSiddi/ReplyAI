package com.email.ReplyAI.model;

import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;
    private String tone;
}
