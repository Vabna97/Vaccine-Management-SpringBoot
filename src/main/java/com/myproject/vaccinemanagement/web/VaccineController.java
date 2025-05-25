package com.myproject.vaccinemanagement.web;

import com.myproject.vaccinemanagement.model.Vaccine;
import com.myproject.vaccinemanagement.service.IVaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VaccineController {
    @Autowired
    private IVaccineService service;

    @GetMapping("/vaccine-info")
    public String getVaccinceInfo(Model model){
        List<Vaccine> vaccine = service.fetchAllVaccine();
        model.addAttribute("vaccinedata", vaccine);
        vaccine.forEach(System.out::println);//debugging
        return "vaccineinfo";
    }
    
    @PostMapping("/add-vac")
    public String registerVac(@ModelAttribute("vaccine") Vaccine vaccine, Model model) {
    	service.registerVaccineDetails(vaccine);
    	return "redirect:/vaccine-info";
    }
    
    @GetMapping("/show-form")
    public String showForm(Model model) {
    	model.addAttribute("vaccine", new Vaccine());
    	return "showform";
    }
    
    @GetMapping("/update-vac")
    public String updateVaccineInfo(@RequestParam("vxid")Integer id, Model model) {
    	Vaccine vac = service.fetchVaccineById(id);
    	model.addAttribute("vaccine", vac);
		return "updateform";	
    }
    @GetMapping("/delete-data")
    public String deleteVaccineInfo(@RequestParam("vxid")Integer id, Model model) {
    	service.deleteVaccineRecord(id);
		return "redirect:/vaccine-info";
    	
    }
}
