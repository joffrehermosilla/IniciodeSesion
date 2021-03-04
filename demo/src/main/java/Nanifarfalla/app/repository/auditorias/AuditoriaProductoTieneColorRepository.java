package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaProductoTieneColor;


@Repository
public interface AuditoriaProductoTieneColorRepository extends JpaRepository<AuditoriaProductoTieneColor, Integer> {

}
