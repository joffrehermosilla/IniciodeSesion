package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.ClienteTienePreferencia;

@Repository
public interface ClienteTienePreferenciaRepository extends JpaRepository<ClienteTienePreferencia, Integer> {

}
