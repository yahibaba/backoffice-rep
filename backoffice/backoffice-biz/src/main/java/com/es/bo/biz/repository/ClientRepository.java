package com.es.bo.biz.repository;

import com.es.bo.biz.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by myachb on 3/4/2016.
 */
public interface ClientRepository extends MongoRepository<Client, String>{

    public Client findByFirstName(String firstName);
    public List<Client> findByLastName(String lastName);


}
