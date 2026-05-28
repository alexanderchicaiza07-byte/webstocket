package com.unibe.webSockets.WEBSOCKETS;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller // Anotación para indicar que esta clase es un controlador de Spring
public class ChatController {

    // Este método escucha mensajes enviados a "/app/chat.enviar"
    // El prefijo "/app" ya está definido en tu WebSocketConfig
    @MessageMapping("/chat.enviar")
    
    // Este método reenvía el mensaje a todos los suscritos a "/topic/mensajes"
    @SendTo("/topic/mensajes")
    public MensajeChat enviarMensaje(MensajeChat mensaje) {
        // Aquí podrías añadir lógica extra, como guardar en base de datos
        return mensaje;
    }
}