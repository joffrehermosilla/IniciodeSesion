package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.RecetaProductoTieneInsumo;


@Repository
public interface RecetaProductoTieneInsumoRepository extends JpaRepository<RecetaProductoTieneInsumo, Integer> {

}
