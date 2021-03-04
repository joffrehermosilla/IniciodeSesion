package Nanifarfalla.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nanifarfalla.app.model.UserAlerta;


@Repository
public interface UserAlertaRepository extends JpaRepository<UserAlerta, Integer> {

}
