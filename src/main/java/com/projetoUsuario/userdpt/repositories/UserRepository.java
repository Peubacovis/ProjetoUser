package com.projetoUsuario.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoUsuario.userdpt.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
