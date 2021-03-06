package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaZona;

@Repository
public interface AuditoriaZonaRepository extends JpaRepository<AuditoriaZona, Integer> {

}
