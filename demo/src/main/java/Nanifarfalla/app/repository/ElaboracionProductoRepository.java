package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.ElaboracionProducto;
@Repository
public interface ElaboracionProductoRepository extends JpaRepository<ElaboracionProducto, Integer> {

}
