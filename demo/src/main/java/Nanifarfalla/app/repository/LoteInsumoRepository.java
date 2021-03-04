package Nanifarfalla.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.LoteInsumo;

@Repository
public interface LoteInsumoRepository extends JpaRepository<LoteInsumo, Integer> {


}
