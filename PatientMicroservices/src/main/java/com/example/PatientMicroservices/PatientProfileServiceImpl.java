package com.example.PatientMicroservices;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientProfileServiceImpl implements PatientProfileService{
	
    ProfileRepository repository;
    List < PatientProfile >patientProfileList = new ArrayList < > ();

    @Override
    public void addEmployeeProfile(PatientProfile profile) {
        repository.save(profile);
    }

    @Override
    public List < PatientProfile > getPatientProfiles() {
        return repository.findAll();
    }
}