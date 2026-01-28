package com.projects.workflow_task_management.organization.repository;

import com.projects.workflow_task_management.organization.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    Optional<Organization> findByName(String name);
}
