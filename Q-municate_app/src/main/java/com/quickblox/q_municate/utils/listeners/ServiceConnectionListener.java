package com.quickblox.q_municate.utils.listeners;

import com.quickblox.q_municate.chat.ChatConnectionProvider;
import com.quickblox.q_municate_core.service.QBService;

public interface ServiceConnectionListener {

    void onConnectedToService(QBService service);

    void onConnectedToChatService(ChatConnectionProvider chatConnection);
}