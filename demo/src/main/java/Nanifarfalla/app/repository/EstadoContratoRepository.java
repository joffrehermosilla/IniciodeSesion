package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.EstadoContrato;
@Repository
public interface EstadoContratoRepository extends JpaRepository<EstadoContrato, Integer> {

}
