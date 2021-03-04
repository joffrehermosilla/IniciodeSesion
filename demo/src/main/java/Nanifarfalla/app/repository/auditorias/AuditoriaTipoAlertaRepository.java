package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaTipoAlerta;

@Repository
public interface AuditoriaTipoAlertaRepository extends JpaRepository<AuditoriaTipoAlerta, Integer> {

}
