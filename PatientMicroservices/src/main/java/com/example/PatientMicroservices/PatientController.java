package com.example.PatientMicroservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PatientController {
	@Autowired
    PatientProfileService patientProfileService;

    @PostMapping
    public void savePatientProfile(@RequestBody PatientProfile patientProfile) {
    	patientProfileService.addEmployeeProfile(patientProfile);
    }

    @GetMapping
    public List < PatientProfile > getAllPatient() {
        return patientProfileService.getPatientProfiles();
    }

}