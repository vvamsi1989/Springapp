package com.fullstack.webapp.repositories;

import com.fullstack.webapp.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

  Project findByProjectIdentifier(String identifier);


  @Override
    Iterable<Project> findAll();

}
