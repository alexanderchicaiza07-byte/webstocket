package com.unibe.webSockets.WEBSOCKETS;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("remitente")
    private String remitente;
    @JsonProperty("contenido")
    private String contenido;
    @JsonProperty("fechaEnvio")
    private LocalDateTime fechaEnvio;
    @JsonProperty("archivoBase64")
    private String archivoBase64;

    // Constructores, Getters y Setters...
    public Mensaje() { this.fechaEnvio = LocalDateTime.now(); }
    // ... (añade los getters y setters aquí)
}