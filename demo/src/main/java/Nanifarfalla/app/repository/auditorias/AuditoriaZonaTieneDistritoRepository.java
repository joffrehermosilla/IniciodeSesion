package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaZonaTieneDistrito;


@Repository
public interface AuditoriaZonaTieneDistritoRepository extends JpaRepository<AuditoriaZonaTieneDistrito, Integer> {

}
