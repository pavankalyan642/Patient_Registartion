package in.ashokit.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.springcloud.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
