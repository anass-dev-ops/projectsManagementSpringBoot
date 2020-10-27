package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taskManagement.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
}
