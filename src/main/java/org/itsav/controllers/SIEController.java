package org.itsav.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.itsav.service.*;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import org.itsav.domain.entities.Alumnos;

import jakarta.ws.rs.DELETE;


import jakarta.ws.rs.PUT;


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


    @Inject
    EstadosService estadosService;

    @GET
    @Path("obtener_estados")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerEstados() {
        return Response.ok(estadosService.findAll()).build();
    }

    @Inject
    CiudadesService ciudadesService;

    @GET
    @Path("obtener_ciudades")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerCiudades() {
        return Response.ok(ciudadesService.findAll()).build();
    }

    @Inject
    DiscapacidadesMedicasService discapacidadesService;

    @GET
    @Path("obtener_discapacidades_medicos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerDiscapacidadesMedicos() {

        return Response.ok(discapacidadesService.findAll()).build();
    }

    @Inject
    PaisesServices paisesServices;

    @GET
    @Path("obtener_paises")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerPaises() {

        return Response.ok(paisesServices.findAll()).build();
    }

    @Inject
    AlergiaDatosmedicosService alergiaDatosmedicosService;

    @GET
    @Path("obtener_alergias_datos_medicos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerAlergiasDatosMedicos() {

        return Response.ok(alergiaDatosmedicosService.findAll()).build();
    }

    @Inject
    AlumnosDireccionesService alumnosDireccionesService;

    @GET
    @Path("obtener_alumnos_direcciones")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerAlumnosDirecciones() {

        return Response.ok(alumnosDireccionesService.findAll()).build();
    }


    @Inject
    DiscapacidadesDatosMedicosService discapacidadesDatosMedicosService;

    @GET
    @Path("obtener_discapacidades_datos_medicos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerDiscapacidadesDatosMedicos() {
        return Response.ok(
                discapacidadesDatosMedicosService.findAll()
        ).build();
    }

    @Inject
    AlumnosService alumnosService;


    @GET
    @Path("alumnos/{numControl}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarAlumnoPorNumeroControl(
            @PathParam("numControl") String numControl) {

        return alumnosService.buscarPorNumeroControl(numControl)
                .map(alumno -> Response.ok(alumno).build())
                .orElseGet(() -> Response.status(
                                Response.Status.NOT_FOUND)
                        .entity("Alumno no encontrado")
                        .build());
    }


    @GET
    @Path("obtener_alumnos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerAlumnos() {
        return Response.ok(alumnosService.findAll()).build();
    }


    @POST
    @Path("registrar_alumno")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registrarAlumno(Alumnos alumno) {

        if (alumno == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Debes proporcionar los datos del alumno")
                    .build();
        }

        Alumnos nuevoAlumno = alumnosService.registrarAlumno(alumno);

        return Response.status(Response.Status.CREATED)
                .entity(nuevoAlumno)
                .build();
    }


    @PUT
    @Path("actualizar_alumno/{numControl}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizarAlumno(
            @PathParam("numControl") String numControl,
            Alumnos datosActualizados) {

        if (datosActualizados == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Debes proporcionar los datos del alumno")
                    .build();
        }

        Alumnos alumnoActualizado =
                alumnosService.actualizarAlumno(
                        numControl,
                        datosActualizados
                );

        return Response.ok(alumnoActualizado).build();
    }


    @DELETE
    @Path("baja_alumno/{numControl}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response darDeBajaAlumno(
            @PathParam("numControl") String numControl) {

        Alumnos alumno =
                alumnosService.darDeBajaAlumno(numControl);

        return Response.ok(alumno).build();
    }


    @PUT
    @Path("reactivar_alumno/{numControl}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response reactivarAlumno(
            @PathParam("numControl") String numControl) {

        Alumnos alumnoReactivado =
                alumnosService.reactivarAlumno(numControl);

        return Response.ok(alumnoReactivado).build();
    }

    // Obtener alumnos activos
    @GET
    @Path("alumnos_activos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerAlumnosActivos() {
        return Response.ok(
                alumnosService.buscarAlumnosActivos()
        ).build();
    }

    // Obtener alumnos inactivos
    @GET
    @Path("alumnos_inactivos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerAlumnosInactivos() {
        return Response.ok(
                alumnosService.buscarAlumnosInactivos()
        ).build();
    }



    @Inject
    DatosMedicosService datosMedicosService;

    @GET
    @Path("obtener_datos_medicos")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerDatosMedicos() {
        return Response.ok(datosMedicosService.findAll()).build();
    }


    @Inject
    DireccionesService direccionesService;

    @GET
    @Path("obtener_direcciones")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerDirecciones() {
        return Response.ok(direccionesService.findAll()).build();
    }





}





