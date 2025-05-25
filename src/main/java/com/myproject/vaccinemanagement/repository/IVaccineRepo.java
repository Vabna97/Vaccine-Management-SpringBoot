package com.myproject.vaccinemanagement.repository;

import com.myproject.vaccinemanagement.model.Vaccine;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}