package cotn.clinicalservice.controller;

import cotn.clinicalservice.model.Patient;
import cotn.clinicalservice.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kaustavbasu
 * @Date 9/23/20
 * @Time 11:51 PM
 */
@CrossOrigin(origins = {"http://localhost:3000"})

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping
    public List<Patient> findAllPatient() {
        return patientService.findAllPatient();
    }

    @PostMapping
    public ResponseEntity<Patient> saveDetails(@RequestBody Patient patient) {
        patientService.saveDetails(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(patient);
    }


}
