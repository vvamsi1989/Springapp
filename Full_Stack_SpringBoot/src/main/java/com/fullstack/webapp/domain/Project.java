package com.fullstack.webapp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Project Name should not be empty")
    private String projectName;
    @NotBlank(message = "Project Identifier should not be blank")
    @Size(min=4,max=5,message="Please give only 4 to 5 characters")
    @Column(updatable = false,unique=true)
    private String projectIdentifier;
    @NotBlank(message="description cannot be blank")
    private String description;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date start_date;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date end_date;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date created_At;
    @JsonFormat(pattern = "yyyy-mm-dd")
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
