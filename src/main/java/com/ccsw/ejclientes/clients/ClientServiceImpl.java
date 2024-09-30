package com.ccsw.ejclientes.clients;

import com.ccsw.ejclientes.clients.model.Clients;
import com.ccsw.ejclientes.clients.model.ClientsDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Clients> findAll() {

        return (List<Clients>) this.clientRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    public void save(Long id, ClientsDto dto) {

        Clients client;

        if (id == null) {
            client = new Clients();
        } else {
            client = this.clientRepository.findById(id).orElse(null);
        }

        client.setName(dto.getName());

        this.clientRepository.save(client);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) throws Exception {

        if (this.clientRepository.findById(id).orElse(null) == null) {
            throw new Exception("Not exists");
        }

        this.clientRepository.deleteById(id);
    }

}
