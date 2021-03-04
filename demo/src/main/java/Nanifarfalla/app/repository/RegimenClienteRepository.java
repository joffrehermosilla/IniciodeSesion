package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.RegimenCliente;

@Repository
public interface RegimenClienteRepository extends JpaRepository<RegimenCliente, Integer>  {

}
