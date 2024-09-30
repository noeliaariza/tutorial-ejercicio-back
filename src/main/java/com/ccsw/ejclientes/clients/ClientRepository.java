package com.ccsw.ejclientes.clients;

import com.ccsw.ejclientes.clients.model.Clients;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ccsw
 *
 */
public interface ClientRepository extends CrudRepository<Clients, Long> {
}
