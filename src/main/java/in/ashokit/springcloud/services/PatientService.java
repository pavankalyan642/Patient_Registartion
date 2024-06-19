package in.ashokit.springcloud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.springcloud.entities.Patient;
import in.ashokit.springcloud.repository.PatientRepository;
@Service
public class PatientService  implements  Patients_ervice{
	@Autowired
	private PatientRepository patientRepository;


	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public void deletePatient(Patient patient) {
		patientRepository.delete(patient);
		
	}

	@Override
	public Patient findById(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id).get();
	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}
}

   