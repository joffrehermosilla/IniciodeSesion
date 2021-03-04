package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.PresentacionInsumo;
@Repository
public interface PresentacionInsumoRepository extends JpaRepository<PresentacionInsumo, Integer> {

}
