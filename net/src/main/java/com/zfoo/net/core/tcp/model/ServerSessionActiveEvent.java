package com.zfoo.net.core.tcp.model;

import com.zfoo.event.model.event.IEvent;
import com.zfoo.net.session.model.Session;

/************************************************************
 * ServerSessionActiveEvent
 * @date 2022/10/09
 * @author denglichuan@gmail.com
 */
public class ServerSessionActiveEvent  implements IEvent {

    private Session session;

    public static ServerSessionActiveEvent valueOf(Session session) {
        var event = new ServerSessionActiveEvent();
        event.session = session;
        return event;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}