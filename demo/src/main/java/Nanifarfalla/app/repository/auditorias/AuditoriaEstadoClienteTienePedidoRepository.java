package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaEstadoClienteTienePedido;
@Repository
public interface AuditoriaEstadoClienteTienePedidoRepository
		extends JpaRepository<AuditoriaEstadoClienteTienePedido, Integer> {

}
