package com.company.pcmarket.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contacts",collectionResourceRel = "list")
public interface ContactRepository {
}
