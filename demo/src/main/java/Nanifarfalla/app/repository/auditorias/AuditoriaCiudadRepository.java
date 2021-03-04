package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaCiudad;




@Repository
public interface AuditoriaCiudadRepository extends JpaRepository<AuditoriaCiudad, Integer> {

}
