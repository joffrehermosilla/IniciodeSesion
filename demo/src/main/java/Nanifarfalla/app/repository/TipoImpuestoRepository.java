package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.TipoImpuesto;


@Repository
public interface TipoImpuestoRepository  extends JpaRepository<TipoImpuesto, Integer>{

}
