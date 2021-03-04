package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

}
