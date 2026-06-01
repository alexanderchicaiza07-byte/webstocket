package com.unibe.webSockets.WEBSOCKETS;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HistorialController {

    @Autowired
    private MensajeRepository repository;

    // Este endpoint devolverá todos los mensajes al abrir la página
    @GetMapping("/api/historial")
    public List<Mensaje> obtenerHistorial() {
        List<Mensaje> lista = repository.findAll();
        System.out.println("Datos enviados al frontend: " + lista); // Mira la consola de VS Code
        return lista;
    }
}