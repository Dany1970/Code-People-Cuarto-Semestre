package utn.tienda_libros;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframawork.context.ConfigurableApplicationContext;
import utn.tienda_libros.vista.LibroFrom;

import java.awt.EventQueue;

@SpringBootApplication

public class TiendaLibrosApplication {

    public static void main (String[]args) {
    ConfigurableApplicationContext contextoSpring =
    new SpringAplicationBuilder (TiendaLibrosApplication.class)
        .headless(false)
        .web(WebApplicationType.NONE)
        .run(args);

//Ejecutamos el codigo para cargar el formulario
        EventQueue.inovekeLater(()-> //metodo lambda
            //Obtener el objeto from a través del spring
    LibroFrom libroFrom = contextoSpring.getBean()
    libroFrom.setVisible(true);
        }))
}}