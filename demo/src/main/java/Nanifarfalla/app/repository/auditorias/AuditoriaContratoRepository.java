package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaContrato;

@Repository
public interface AuditoriaContratoRepository extends JpaRepository<AuditoriaContrato, Integer> {

}
