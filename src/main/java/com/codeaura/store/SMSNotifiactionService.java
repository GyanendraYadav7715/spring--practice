package com.codeaura.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotifiactionService implements  NotificaitonService{
    @Override
    public  void sendingMessage(String message){
        System.out.println("SMS");
        System.out.println("SMS is sending "+message);
    }
}
