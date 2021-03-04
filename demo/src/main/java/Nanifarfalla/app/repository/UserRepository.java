package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByEmail(String email);

	@Override
	void delete(Usuario user);

}
