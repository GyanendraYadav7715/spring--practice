package com.codeaura.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private NotificaitonService notificaitonService;

    public NotificationManager(NotificaitonService notificaitonService){
        this.notificaitonService=notificaitonService;
    }

    public void sendingMessagesQueue(String message){
        notificaitonService.sendingMessage(message);
    }

}
