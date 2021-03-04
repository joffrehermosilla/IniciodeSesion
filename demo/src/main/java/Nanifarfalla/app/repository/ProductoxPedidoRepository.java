package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.ProductoxPedido;


@Repository
public interface ProductoxPedidoRepository extends JpaRepository<ProductoxPedido, Integer> {

}
