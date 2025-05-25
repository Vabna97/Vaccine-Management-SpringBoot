package com.myproject.vaccinemanagement.service;

import java.util.List;
import java.util.Optional;

import com.myproject.vaccinemanagement.model.Vaccine;

public interface IVaccineService {

	public void registerVaccineDetails(Vaccine vaccine);
    public List<Vaccine> fetchAllVaccine();
    public void deleteVaccineRecord(Integer id);;
    public Vaccine fetchVaccineById(Integer id);
}
