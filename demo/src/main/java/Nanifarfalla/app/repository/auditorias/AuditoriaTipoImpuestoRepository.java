package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaTipoImpuesto;

@Repository
public interface AuditoriaTipoImpuestoRepository extends JpaRepository<AuditoriaTipoImpuesto, Integer> {

}
