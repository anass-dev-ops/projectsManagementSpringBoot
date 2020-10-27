package org.taskManagement.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.ProjectRepository;
import org.taskManagement.entities.Project;
import org.taskManagement.services.IProjectService;

@Service
public class ProjectServiceImp implements IProjectService{
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project createProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project getProjectById(Long idProject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProject(Long idProject) {
		// TODO Auto-generated method stub
		return false;
	}

}
