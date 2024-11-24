package tz.com.ManagerService.controller;

import java.util.List;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.com.ManagerService.service.ManagerService;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {
	

    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable Long id) {
        return managerService.getManagerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Manager createManager(@RequestBody Manager manager) {
        return managerService.createManager(manager);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long id, @RequestBody Manager manager) {
        return managerService.updateManager(id, manager)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteManager(@PathVariable Long id) {
        if (managerService.deleteManager(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
