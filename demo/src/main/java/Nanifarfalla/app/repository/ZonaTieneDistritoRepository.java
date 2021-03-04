package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.ZonaTieneDistrito;


@Repository
public interface ZonaTieneDistritoRepository extends JpaRepository<ZonaTieneDistrito, Integer> {

}
