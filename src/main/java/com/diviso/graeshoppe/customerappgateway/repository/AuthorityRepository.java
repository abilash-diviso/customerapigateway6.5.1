package com.diviso.graeshoppe.customerappgateway.repository;

import com.diviso.graeshoppe.customerappgateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
