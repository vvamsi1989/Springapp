package com.fullstack.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.*;


@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date start_date;
    private Date end_date;
    private Date created_At;
    private Date update_At;

    public Project(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getprojectName(){
        return projectName;
    }

    public void setProjectName(String projectName){
        this.projectName=projectName;
    }

    public String getprojectIdentifier(){
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier){
        this.projectIdentifier=projectIdentifier;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }



    @PrePersist
    protected void onCreate(){
        this.created_At = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.update_At = new Date();
    }

}
