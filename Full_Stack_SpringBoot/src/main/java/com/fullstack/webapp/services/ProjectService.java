package com.fullstack.webapp.services;

import com.fullstack.webapp.exceptions.ProjectIdException;
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
        try {
            project.setProjectIdentifier(project.getprojectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }
        catch (Exception e){
            throw new ProjectIdException("Project ID" + project.getprojectIdentifier().toUpperCase()+ " already exists");
        }
    }

    public Project findProjectByIdentifier(String projectId){

        Project project = projectRepository.findByProjectIdentifier(projectId);
        if(project==null){
           throw new ProjectIdException("Project ID: " +projectId+" does not exist");
        }

        return project;

    }
}



