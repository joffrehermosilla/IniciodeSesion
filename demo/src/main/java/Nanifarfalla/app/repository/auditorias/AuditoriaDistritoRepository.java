package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaDistrito;


@Repository
public interface AuditoriaDistritoRepository extends JpaRepository<AuditoriaDistrito, Integer> {

}
