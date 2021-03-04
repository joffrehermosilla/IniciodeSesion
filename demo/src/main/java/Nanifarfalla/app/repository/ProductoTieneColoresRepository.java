package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.ProductoTieneColores;

@Repository
public interface ProductoTieneColoresRepository extends JpaRepository<ProductoTieneColores, Integer> {

}
