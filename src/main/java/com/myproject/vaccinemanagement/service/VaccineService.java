package com.myproject.vaccinemanagement.service;

import com.myproject.vaccinemanagement.model.Vaccine;
import com.myproject.vaccinemanagement.repository.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService implements IVaccineService{
    IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public void registerVaccineDetails(Vaccine vaccine) {
        repo.save(vaccine);
    }

    @Override
    public List<Vaccine> fetchAllVaccine() {
        return (List<Vaccine>)repo.findAll();
    }



    @Override
    public void deleteVaccineRecord(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Vaccine fetchVaccineById(Integer id) {
        
    	Optional<Vaccine> optional = repo.findById(id); 
    	return optional.get();
    }
}
