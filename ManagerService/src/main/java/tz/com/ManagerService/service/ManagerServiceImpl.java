package tz.com.ManagerService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.com.ManagerService.model.Manager;
import tz.com.ManagerService.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService{

	 @Autowired
	    private ManagerRepository managerRepository;

	    @Override
	    public List<Manager> getAllManagers() {
	        return managerRepository.findAll();
	    }

	    @Override
	    public Optional<Manager> getManagerById(Long id) {
	        return managerRepository.findById(id);
	    }

	    @Override
	    public Manager createManager(Manager manager) {
	        return managerRepository.save(manager);
	    }

	    @Override
	    public Optional<Manager> updateManager(Long id, Manager managerDetails) {
	        return managerRepository.findById(id).map(manager -> {
	            manager.setName(managerDetails.getName());
	            manager.setEmail(managerDetails.getEmail());
	            manager.setDepartment(managerDetails.getDepartment());
	            return managerRepository.save(manager);
	        });
	    }

	    @Override
	    public boolean deleteManager(Long id) {
	        if (managerRepository.existsById(id)) {
	            managerRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
}
