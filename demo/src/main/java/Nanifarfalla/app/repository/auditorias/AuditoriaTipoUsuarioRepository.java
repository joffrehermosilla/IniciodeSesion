package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaTipoUsuario;

@Repository
public interface AuditoriaTipoUsuarioRepository extends JpaRepository<AuditoriaTipoUsuario, Integer> {

}
