package com.marcin.Informationboard.information.service;

import com.marcin.Informationboard.information.model.AddInformationRequest;
import com.marcin.Informationboard.information.model.Information;
import com.marcin.Informationboard.information.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {

    private final InformationRepository repository;

    @Autowired
    public InformationService(InformationRepository repository) {
        this.repository = repository;
    }

    public void addInformation(AddInformationRequest request) {
        Information information = new Information();
        information.setContent(request.getContent());
        repository.save(information);
    }

    public List<Information> getAllInformations() {
        return repository.findAll();
    }

    public void deleteInformation(Integer informationId) {
        repository.deleteById(informationId);
    }
}
