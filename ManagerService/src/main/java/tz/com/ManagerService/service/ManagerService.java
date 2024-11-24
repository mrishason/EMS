package tz.com.ManagerService.service;


import java.util.List;
import java.util.Optional;

import tz.com.ManagerService.model.Manager;

public interface ManagerService {

	 List<Manager> getAllManagers();

	    Optional<Manager> getManagerById(Long id);

	    Manager createManager(Manager manager);

	    Optional<Manager> updateManager(Long id, Manager manager);

	    boolean deleteManager(Long id);
}
