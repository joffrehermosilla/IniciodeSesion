package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaProducto;


@Repository
public interface AuditoriaProductoRepository extends JpaRepository<AuditoriaProducto, Integer> {

}
