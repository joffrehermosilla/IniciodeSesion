package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaUsuario;


@Repository
public interface AuditoriaUsuarioRepository extends JpaRepository<AuditoriaUsuario, Integer> {

}
