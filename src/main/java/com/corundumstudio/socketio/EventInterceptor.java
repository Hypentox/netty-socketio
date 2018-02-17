package com.corundumstudio.socketio;

import java.util.List;

public interface EventInterceptor<T> {

    void onEvent(SocketIOClient client, String eventName, List<Object> args, AckRequest ackSender);
}
