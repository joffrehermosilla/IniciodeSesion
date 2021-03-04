package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaLoteInsumo;

@Repository
public interface AuditoriaLoteInsumoRepository extends JpaRepository<AuditoriaLoteInsumo, Integer> {

}
