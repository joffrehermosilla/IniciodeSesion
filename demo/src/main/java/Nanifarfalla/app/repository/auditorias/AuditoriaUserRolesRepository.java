package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaUserRoles;


@Repository
public interface AuditoriaUserRolesRepository extends JpaRepository<AuditoriaUserRoles, Integer> {

}
