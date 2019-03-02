package com.fullstack.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.fullstack.webapp.repositories.ProjectRepository;
import com.fullstack.webapp.domain.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        //Logic

        return projectRepository.save(project);

    }
}



