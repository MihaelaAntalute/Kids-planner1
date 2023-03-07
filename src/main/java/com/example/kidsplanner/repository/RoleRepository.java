package com.example.kidsplanner.repository;

import com.example.kidsplanner.model.Role;
import com.example.kidsplanner.model.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByRoleType(RoleType roleType);

}
