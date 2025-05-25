package com.myproject.vaccinemanagement.repository;

import com.myproject.vaccinemanagement.model.Vaccine;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
    public List<Vaccine> findByVaccineNameContaining(String containing);
    public List<Vaccine> findBySupplierContaining(String containing);
    public List<Vaccine> findByManufacturingCompanyContaining(String containing);


}