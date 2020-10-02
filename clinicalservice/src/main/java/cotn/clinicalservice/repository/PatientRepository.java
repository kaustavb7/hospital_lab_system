package cotn.clinicalservice.repository;

import cotn.clinicalservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kaustavbasu
 * @Date 9/23/20
 * @Time 11:46 PM
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{
}
