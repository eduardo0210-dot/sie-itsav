package org.itsav.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.itsav.service.AlergiasService;
import org.itsav.service.UsuariosService;

import java.util.List;
import java.util.ArrayList;

@Path("/hello")
public class SIEController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET

    @Path("lista-tec")

    @Produces(MediaType.APPLICATION_JSON)

    public List<String>listaNombres(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Quarks");
        nombres.add("Angular");
        nombres.add("Spring");
        nombres.add("MySQL");

        return nombres;
    }

    @Inject
    UsuariosService usuariosService;

    @GET
    @Path("lista-alumnos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ListaAlumnos() {
        var listaUsuarios = usuariosService.getInfoUsuarios();
        return Response.ok(listaUsuarios).build();
    }

    @Inject
    AlergiasService alergiasService;

    @GET
    @Path("obtener_alergias")
    @Produces(MediaType.APPLICATION_JSON)
    public  Response obtenerAlergias(){
        return Response.ok(alergiasService.findAll()).build();
    }

}




