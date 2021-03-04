package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.Insumo;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Integer> {

}
