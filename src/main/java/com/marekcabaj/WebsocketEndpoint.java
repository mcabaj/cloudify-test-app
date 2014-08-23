package com.marekcabaj;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/**
 * @author mcabaj
 * @since on 2014-08-23.
 */
@ServerEndpoint(value = "/ws")
public class WebsocketEndpoint {

    @OnOpen
    public void onOpen(Session session) {

    }

    @OnMessage
    public void onMessage(Session session, String msg) {
        System.out.println(msg);
    }

    @OnError
    public void onError(Session session, Throwable error) {

    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
    }
}
