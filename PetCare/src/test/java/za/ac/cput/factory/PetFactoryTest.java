package za.ac.cput.factory;

import za.ac.cput.domain.Pet;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MedicalRecord;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
//ToDo add owner
class PetFactoryTest {
    ArrayList<MedicalRecord> medicalList = new ArrayList<>(Collections.singletonList(
            MedicalRecordFactory.createMedicalRecord("Tuberculosis", "Antibiotics tablet")));
    private Pet petWithoutName = PetFactory.createPet(null,"Jimmy","Pitbull","Canine",3,medicalList);
    private Pet petWithoutBreed = PetFactory.createPet(null,"Jimmy","Pitbull","Canine",3,medicalList);
    private Pet petWithoutSpecies = PetFactory.createPet(null,"Jimmy","Pitbull","Canine",3,medicalList);
    private Pet petWithoutAge = PetFactory.createPet(null,"Jimmy","Pitbull","Canine",0,medicalList);
    private Pet petWithoutMedicalRecord = PetFactory.createPet(null,"Jimmy","Pitbull","Canine",0,null);
    private Pet pet = PetFactory.createPet(null,"Jimmy","Pitbull","Canine",3,medicalList);
    @Test
    void createPetWithoutName() {
        assertNotNull(petWithoutName);
        System.out.println(petWithoutName);
    }
    @Test
    void createPetWithoutBreed() {
        assertNotNull(petWithoutBreed);
        System.out.println(petWithoutBreed);
    }
    @Test
    void createPetWithoutSpecies() {
        assertNotNull(petWithoutSpecies);
        System.out.println(petWithoutSpecies);
    }
    @Test
    void createPetWithoutAge() {
        assertNotNull(petWithoutAge);
        System.out.println(petWithoutAge);
    }
    @Test
    void createPetWithoutMedicalRecord() {
        assertNotNull(petWithoutMedicalRecord);
        System.out.println(petWithoutMedicalRecord);
    }
    @Test
    void createPet() {
        assertNotNull(pet);
        System.out.println(pet);
    }
}