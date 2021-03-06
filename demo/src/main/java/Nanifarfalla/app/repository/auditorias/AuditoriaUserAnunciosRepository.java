package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaUserAnuncios;

@Repository
public interface AuditoriaUserAnunciosRepository extends JpaRepository<AuditoriaUserAnuncios, Integer> {

}
