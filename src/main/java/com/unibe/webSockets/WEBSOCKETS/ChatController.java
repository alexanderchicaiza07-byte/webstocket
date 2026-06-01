package com.unibe.webSockets.WEBSOCKETS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private MensajeRepository repository;

    @MessageMapping("/chat.enviar")
    @SendTo("/topic/mensajes")
    public Mensaje enviarMensaje(@NonNull Mensaje mensaje) {
        // Guardamos en PostgreSQL
        return repository.save(mensaje);
    }
}