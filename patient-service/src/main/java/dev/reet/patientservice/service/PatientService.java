package dev.reet.patientservice.service;

import dev.reet.patientservice.dto.PatientResponseDTO;
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

        // List<PatientResponseDTO> patientResponseDTOs = patients.stream()
        //         .map(patient -> PatientMapper.toDTO(patient)).toList();
        // return patientResponseDTOs;

        return patients.stream().map(PatientMapper::toDTO).toList();
    }
}
