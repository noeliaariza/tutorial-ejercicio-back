package com.ccsw.ejclientes.clients;

import com.ccsw.ejclientes.clients.model.ClientsDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ccsw
 *
 */
@Service
public class ClientServiceImpl implements ClientService {
    private long SEQUENCE = 1;
    private Map<Long, ClientsDto> clients = new HashMap<Long, ClientsDto>();

    /**
     * {@inheritDoc}
     */
    public List<ClientsDto> findAll() {

        return new ArrayList<ClientsDto>(this.clients.values());
    }

    /**
     * {@inheritDoc}
     */
    public void save(Long id, ClientsDto dto) {

        ClientsDto client;

        if (id == null) {
            client = new ClientsDto();
            client.setId(this.SEQUENCE++);
            this.clients.put(client.getId(), client);
        } else {
            client = this.clients.get(id);
        }

        client.setName(dto.getName());
    }

    /**
     * {@inheritDoc}
     */
    public void delete(Long id) {

        this.clients.remove(id);
    }

}
