package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaProvincia;


@Repository
public interface AuditoriaProvinciaRepository extends JpaRepository<AuditoriaProvincia, Integer> {

}
