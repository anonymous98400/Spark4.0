package org.cfs.BootP01;

import org.springframework.stereotype.Service;
@Service
public class EmailService implements MessageService {
    @Override

    public void sendMessage() {
        System.out.println("EmailService called");
    }

}
