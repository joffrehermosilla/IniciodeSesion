package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaRoleHasPrivileges;


@Repository
public interface AuditoriaRoleHasPrivilegesRepository extends JpaRepository<AuditoriaRoleHasPrivileges, Integer> {

}
