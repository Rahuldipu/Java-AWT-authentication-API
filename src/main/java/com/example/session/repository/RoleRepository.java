package com.example.session.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.session.models.ERole;
import com.example.session.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
	Optional<Role>findByName(ERole name);
}
