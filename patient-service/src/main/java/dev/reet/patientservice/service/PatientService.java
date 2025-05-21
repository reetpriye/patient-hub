package dev.reet.patientservice.service;

import dev.reet.patientservice.dto.PatientRequestDTO;
import dev.reet.patientservice.dto.PatientResponseDTO;
import dev.reet.patientservice.exception.EmailAlreadyExistsException;
import dev.reet.patientservice.mapper.PatientMapper;
import dev.reet.patientservice.model.Patient;
import dev.reet.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients(){
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDTO).toList();
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO){
        if(patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException("A patient with this email "
            + "already exists: " + patientRequestDTO.getEmail());
        }
        Patient newPatient = patientRepository.save(PatientMapper.toModel((patientRequestDTO)));
        return PatientMapper.toDTO(newPatient);
    }
}
