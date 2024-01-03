package com.assingment.liveasylogisticsapi.Rest;

import com.assingment.liveasylogisticsapi.entity.LoadEntity;
import com.assingment.liveasylogisticsapi.servicelayer.LoadEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LoadController {

    private  LoadEntityService loadEntityService;

    @Autowired
    public LoadController(LoadEntityService loadEntityService) {
        this.loadEntityService = loadEntityService;
    }

    @PostMapping
    public ResponseEntity<String> createLoad(@RequestBody LoadEntity loadEntity) {
        loadEntityService.saveLoadEntity(loadEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Load details added successfully");
    }

    @GetMapping
    public ResponseEntity<List<LoadEntity>> getLoadsByShipperId(@RequestParam String shipperId) {
        List<LoadEntity> loads = loadEntityService.getLoadsByShipperId(shipperId);
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<LoadEntity> getLoadById(@PathVariable Long loadId) {
        LoadEntity load = loadEntityService.getLoadEntityById(loadId);
        return ResponseEntity.ok(load);
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<String> updateLoad(@PathVariable Long loadId, @RequestBody LoadEntity updatedLoad) {
        loadEntityService.updateLoadEntity(loadId, updatedLoad);
        return ResponseEntity.ok("Load details updated successfully");
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable Long loadId) {
        loadEntityService.deleteLoadEntity(loadId);
        return ResponseEntity.ok("Load deleted successfully");
    }
}
