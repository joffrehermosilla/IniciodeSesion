package Nanifarfalla.app.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.auditorias.AuditoriaRecetaProductoTieneInsumo;

@Repository
public interface AuditoriaRecetaProductoTieneInsumoRepository
		extends JpaRepository<AuditoriaRecetaProductoTieneInsumo, Integer> {

}
