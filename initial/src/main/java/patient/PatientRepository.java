package patient;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "patients", path = "patients")
public interface PatientRepository extends PagingAndSortingRepository<Patient, Long> {

    List<Patient> findByName(@Param("name") String name);
    List<Patient> findByEmailAddress(@Param("emailAddress") String emailAddress);
    List<Patient> findById(@Param("id") long id);
}
