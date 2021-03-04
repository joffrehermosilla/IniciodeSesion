package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaClienteTienePreferencia;

@Repository
public interface AuditoriaClienteTienePreferenciaRepository
		extends JpaRepository<AuditoriaClienteTienePreferencia, Integer> {

}
