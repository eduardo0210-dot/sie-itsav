package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.records.InfoUsarioDTO;
import org.itsav.service.UsuariosService;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsuariosServiceImpl implements UsuariosService {
    @Override
    public void getInfoUsuario(String numControl) {

    }

    @Override
    public List<InfoUsarioDTO> getInfoUsuarios() {
        List<InfoUsarioDTO> infousuarios = new ArrayList<>();
        infousuarios.add(new InfoUsarioDTO("1","Jose"));
        infousuarios.add(new InfoUsarioDTO("2","Maria"));
        infousuarios.add(new InfoUsarioDTO("3","Juan"));
        infousuarios.add(new InfoUsarioDTO("4","Pedro"));
        infousuarios.add(new InfoUsarioDTO("5","Antonio"));
        infousuarios.add(new InfoUsarioDTO("6","Carlos"));
        infousuarios.add(new InfoUsarioDTO("7","Esteban"));
        infousuarios.add(new InfoUsarioDTO("8","Nacario"));
        infousuarios.add(new InfoUsarioDTO("9","Rosa"));
        infousuarios.add(new InfoUsarioDTO("10","Natalia"));
        return infousuarios;
    }
}

