package com.codeaura.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements  NotificaitonService{

    @Override
    public  void sendingMessage(String message){
        System.out.println("Email");
        System.out.println("Email is sending "+message);
    }
}
