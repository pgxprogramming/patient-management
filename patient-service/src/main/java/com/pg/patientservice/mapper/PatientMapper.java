package com.pg.patientservice.mapper;

import com.pg.patientservice.dto.PatientRequestDTO;
import com.pg.patientservice.dto.PatientResponseDTO;
import com.pg.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    //static method: we can call the method toDTO using classname no object creation needed.
    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;

    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO){
        Patient patient = new Patient();

        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }

}
