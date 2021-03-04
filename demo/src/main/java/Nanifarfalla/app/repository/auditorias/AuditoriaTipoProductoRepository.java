package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaTipoProducto;


@Repository
public interface AuditoriaTipoProductoRepository extends JpaRepository<AuditoriaTipoProducto, Integer> {

}
