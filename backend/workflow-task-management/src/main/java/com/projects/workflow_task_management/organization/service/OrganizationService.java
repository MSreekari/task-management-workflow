package com.projects.workflow_task_management.organization.service;

import com.projects.workflow_task_management.organization.entity.Organization;
import com.projects.workflow_task_management.organization.repository.OrganizationRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository organizationRepository;

    public Organization createOrganization(String name) {
        Organization organization = Organization.builder()
                .name(name)
                .build();
        return organizationRepository.save(organization);
    }
}
