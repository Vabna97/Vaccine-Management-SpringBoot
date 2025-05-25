package com.myproject.vaccinemanagement.service;

import java.util.List;
import java.util.Optional;

import com.myproject.vaccinemanagement.model.Vaccine;

public interface IVaccineService {

	public void registerVaccineDetails(Vaccine vaccine);
    public List<Vaccine> fetchAllVaccine();
    public List<Vaccine> searchByVaccineNameContaining(String containing);
    public List<Vaccine> searchBySupplierContaining(String containing);
    public List<Vaccine> searchByManufacturingCompanyContaining(String containing);
    public void deleteVaccineRecord(Integer id);;
    public Vaccine fetchVaccineById(Integer id);
}
