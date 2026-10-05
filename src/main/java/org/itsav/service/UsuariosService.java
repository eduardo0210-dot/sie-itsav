package org.itsav.service;

import org.itsav.domain.records.InfoUsarioDTO;

import java.util.List;

public interface UsuariosService {
    public void getInfoUsuario(String numControl);
    public List<InfoUsarioDTO> getInfoUsuarios();
}
