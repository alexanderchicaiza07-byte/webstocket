package com.unibe.webSockets.WEBSOCKETS;

public class MensajeChat {
    private String remitente;
    private String contenido;

    // Constructores vacíos y con parámetros necesarios para Jackson (JSON)
    public MensajeChat() {}
    public MensajeChat(String remitente, String contenido) {
        this.remitente = remitente;
        this.contenido = contenido;
    }

    // Getters y Setters
    public String getRemitente() { return remitente; }
    public void setRemitente(String remitente) { this.remitente = remitente; }
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
}