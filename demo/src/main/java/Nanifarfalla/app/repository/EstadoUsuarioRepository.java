package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Nanifarfalla.app.model.EstadoUsuario;

public interface EstadoUsuarioRepository extends JpaRepository<EstadoUsuario, Integer> {

}
