package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaAnuncio;

@Repository
public interface AuditoriaAnuncios extends JpaRepository<AuditoriaAnuncio, Integer> {

}
