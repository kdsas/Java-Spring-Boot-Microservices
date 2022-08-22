package com.example.PatientMicroservices;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PatientProfileService {
void addEmployeeProfile(PatientProfile profile);
    List < PatientProfile > getPatientProfiles();
}