package com.ccsw.ejclientes.clients;

import com.ccsw.ejclientes.clients.model.ClientsDto;

import java.util.List;

/**
 * @author ccsw
 *
 */
public interface ClientService {
    /**
     * Método para recuperar todos los clientes
     *
     * @return {@link List} de {@link Client}
     */
    List<ClientsDto> findAll();

    /**
     * Método para crear o actualizar un cliente
     *
     * @param id PK de la entidad
     * @param dto datos de la entidad
     */
    void save(Long id, ClientsDto dto);

    /**
     * Método para borrar un cliente
     *
     * @param id PK de la entidad
     */
    void delete(Long id);

}
