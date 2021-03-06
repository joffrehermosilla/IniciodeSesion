package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaAlerta;


@Repository
public interface AuditoriaAlertaRepository extends JpaRepository<AuditoriaAlerta, Integer> {

}
