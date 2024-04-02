package com.janani.job.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janani.job.portal.dto.PortalUser;

public interface PortalUserRepository extends JpaRepository<PortalUser,Integer>{
boolean existsByEmail(String email);
}
