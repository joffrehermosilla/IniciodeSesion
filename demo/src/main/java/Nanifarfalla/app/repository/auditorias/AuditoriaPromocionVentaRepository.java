package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaPromocionVenta;


@Repository
public interface AuditoriaPromocionVentaRepository extends JpaRepository<AuditoriaPromocionVenta, Integer> {

}
