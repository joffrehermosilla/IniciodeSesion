package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.PromocionVenta;


@Repository
public interface PromocionVentaRepository extends JpaRepository<PromocionVenta, Integer> {

}
