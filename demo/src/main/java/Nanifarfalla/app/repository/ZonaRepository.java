package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.Zona;

@Repository
public interface ZonaRepository extends JpaRepository<Zona, Integer> {

}
