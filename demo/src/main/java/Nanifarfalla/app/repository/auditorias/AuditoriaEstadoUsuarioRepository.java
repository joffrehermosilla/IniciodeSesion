package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;

import Nanifarfalla.app.model.auditorias.AuditoriaEstadoUsuario;

public interface AuditoriaEstadoUsuarioRepository extends JpaRepository<AuditoriaEstadoUsuario, Integer> {

}
