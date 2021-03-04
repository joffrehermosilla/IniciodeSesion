package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.Alerta;

@Repository
public interface AlertaRepository extends JpaRepository<Alerta, Integer> {

}
