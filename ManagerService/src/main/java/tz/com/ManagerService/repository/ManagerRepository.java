package tz.com.ManagerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tz.com.ManagerService.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long>{

}
