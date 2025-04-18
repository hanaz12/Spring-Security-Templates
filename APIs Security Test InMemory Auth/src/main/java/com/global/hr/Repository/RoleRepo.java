package com.global.hr.Repository;

import com.global.hr.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
   Optional <Role> findByName (String name);
}
