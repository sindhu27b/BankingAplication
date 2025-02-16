package com.org.projects.service.impl;

import com.org.projects.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailwithAttachment(EmailDetails emailDetails);
}
