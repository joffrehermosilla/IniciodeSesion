package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.ClienteTienePedido;


@Repository
public interface ClienteTienePedidoRepository extends JpaRepository<ClienteTienePedido, Integer> {

}
