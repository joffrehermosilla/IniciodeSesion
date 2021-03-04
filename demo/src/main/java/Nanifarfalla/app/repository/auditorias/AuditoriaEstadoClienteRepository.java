package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaEstadoCliente;
@Repository
public interface AuditoriaEstadoClienteRepository extends JpaRepository<AuditoriaEstadoCliente, Integer> {

}
