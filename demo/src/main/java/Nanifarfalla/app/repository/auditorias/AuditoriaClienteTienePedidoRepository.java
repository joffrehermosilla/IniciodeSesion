package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaClienteTienePedido;

@Repository
public interface AuditoriaClienteTienePedidoRepository extends JpaRepository<AuditoriaClienteTienePedido, Integer> {

}
