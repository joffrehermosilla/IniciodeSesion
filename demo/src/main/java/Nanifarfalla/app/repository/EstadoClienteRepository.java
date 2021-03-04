package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.EstadoCliente;


@Repository
public interface EstadoClienteRepository extends JpaRepository<EstadoCliente, Integer> {

}
