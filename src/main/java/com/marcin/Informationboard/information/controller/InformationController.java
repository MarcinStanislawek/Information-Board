package com.marcin.Informationboard.information.controller;

import com.marcin.Informationboard.information.model.AddInformationRequest;
import com.marcin.Informationboard.information.model.Information;
import com.marcin.Informationboard.information.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class InformationController {

    private final InformationService service;

    @Autowired
    public InformationController(InformationService service) {
        this.service = service;
    }

    @PostMapping
    public void addInformation(@RequestBody AddInformationRequest request) {
        service.addInformation(request);
    }

    @GetMapping
    public List<Information> getAllInformations() {
        return service.getAllInformations();
    }

    @DeleteMapping(value = "/delete/{informationId}")
    public void deleteInformation(@PathVariable Integer informationId) {
        service.deleteInformation(informationId);
    }
}
