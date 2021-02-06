package com.automate.Project;

import java.util.Date;
import java.util.List;

public class ProjectController {

    private ProjectService projectService = new ProjectService();

    public ProjectResponse<Integer> CreateProject(String nameOfTheProject, Date startDate, Date EndDate){
        if (validate(nameOfTheProject, startDate)){
            ProjectModel projectModel = new ProjectModel();

            final int ProjectIdentifier = projectService.createProject(projectModel);
            final ProjectResponse<Integer> projectResponse = new ProjectResponse("Project is created Successfully.",true);
            projectResponse.setData(ProjectIdentifier);
            return projectResponse;
        }else{
            return new ProjectResponse<>("cannot created project",false);
        }
    }

    private boolean validate(String nameOfTheProject, Date startDate) {
        boolean validationIsSuccess = true;
        if (nameOfTheProject == null) {
            System.out.println("project name is required");
            validationIsSuccess = false;
        }

        if (startDate == null) {
            System.out.println("project start date is required ");
            validationIsSuccess = false;
        }
        return validationIsSuccess;
    }

    public ProjectResponse updateProject(String projectId){
        // implementation

        return null;
    }

    public ProjectResponse deleteProject(String projectId){

        return null;
    }

    public ProjectResponse<List<Project>> listProjectResponse(){

        return null;
    }

        }
