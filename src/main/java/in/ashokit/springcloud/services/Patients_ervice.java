package in.ashokit.springcloud.services;

import java.util.List;

import in.ashokit.springcloud.entities.Patient;

public interface Patients_ervice {
	public Patient savePatient (Patient patient);
	public Patient updatePatient (Patient patient);
	public void deletePatient (Patient patient);
	public Patient findById (int id);
	public List<Patient> findAll();
	

}
