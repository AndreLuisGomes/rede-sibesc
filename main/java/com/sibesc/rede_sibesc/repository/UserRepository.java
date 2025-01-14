package com.sibesc.rede_sibesc.repository;

import com.sibesc.rede_sibesc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
