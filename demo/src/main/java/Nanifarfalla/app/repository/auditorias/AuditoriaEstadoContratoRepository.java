package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaEstadoContrato;
@Repository
public interface AuditoriaEstadoContratoRepository extends JpaRepository<AuditoriaEstadoContrato, Integer> {

}
