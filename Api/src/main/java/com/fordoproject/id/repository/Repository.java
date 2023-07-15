package com.fordoproject.id.repository;
import com.fordoproject.id.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@org.springframework.stereotype.Repository
@Service
public interface Repository extends CrudRepository<Cliente, Long> {

}
