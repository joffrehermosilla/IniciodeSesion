package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaIgvVenta;


@Repository
public interface AuditoriaIgvVentaRepository extends JpaRepository<AuditoriaIgvVenta, Integer>{

}
