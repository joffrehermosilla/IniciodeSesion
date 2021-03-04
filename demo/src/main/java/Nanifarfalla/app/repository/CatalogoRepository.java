package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.Catalogo;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, Integer> {

}
