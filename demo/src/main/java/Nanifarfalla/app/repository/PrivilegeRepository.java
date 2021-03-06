package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Nanifarfalla.app.model.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
	Privilege findByName(String name);

	@Override
	void delete(Privilege privilege);
}
