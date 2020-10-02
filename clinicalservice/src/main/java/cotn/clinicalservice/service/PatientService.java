package cotn.clinicalservice.service;

import cotn.clinicalservice.model.Patient;
import cotn.clinicalservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kaustavbasu
 * @Date 9/23/20
 * @Time 11:48 PM
 */
@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> findAllPatient() {
        return patientRepository.findAll();
    }

    public Patient saveDetails(Patient patient) {
        return patientRepository.save(patient);
    }
}
