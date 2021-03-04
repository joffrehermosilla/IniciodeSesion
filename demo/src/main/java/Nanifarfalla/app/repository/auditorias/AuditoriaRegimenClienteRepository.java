package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaRegimenCliente;

@Repository
public interface AuditoriaRegimenClienteRepository extends JpaRepository<AuditoriaRegimenCliente, Integer> {

}
