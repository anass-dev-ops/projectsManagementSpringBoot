package org.taskManagement.services;

import java.util.List;

import org.taskManagement.entities.Project;

public interface IProjectService {
	public Project createProject(Project project);
	public Project getProjectById(Long idProject);
	public List<Project> getProjects();
	public boolean deleteProject(Long idProject);
}
