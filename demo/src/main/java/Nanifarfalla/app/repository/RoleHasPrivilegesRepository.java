package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.RoleHasPrivileges;

@Repository
public interface RoleHasPrivilegesRepository extends JpaRepository<RoleHasPrivileges, Integer> {

}
