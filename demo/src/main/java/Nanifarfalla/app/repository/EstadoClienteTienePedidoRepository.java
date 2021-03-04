package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.EstadoClienteTienePedido;

@Repository
public interface EstadoClienteTienePedidoRepository extends JpaRepository<EstadoClienteTienePedido, Integer> {

}
