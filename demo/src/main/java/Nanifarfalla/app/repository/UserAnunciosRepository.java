package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.UserAnuncios;

@Repository
public interface UserAnunciosRepository extends JpaRepository<UserAnuncios, Integer> {

}
