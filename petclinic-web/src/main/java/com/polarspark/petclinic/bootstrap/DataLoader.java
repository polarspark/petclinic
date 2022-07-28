package com.polarspark.petclinic.bootstrap;

import com.polarspark.petclinic.model.*;
import com.polarspark.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);


        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);


        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel Way");
        owner1.setCity("Miami");
        owner1.setTelephone("123-456-7890");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);
        Visit visit1 = new Visit();
        visit1.setPet(mikesPet);
        visit1.setDate(LocalDate.now());
        visit1.setDescription("Sick");
        visitService.save(visit1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Sam");
        owner2.setLastName("Axe");
        owner2.setAddress("123 Brickerel Way");
        owner2.setCity("Miami");
        owner2.setTelephone("123-456-7890");
        Pet samsPet = new Pet();
        samsPet.setPetType(savedCatPetType);
        samsPet.setOwner(owner2);
        samsPet.setBirthDate(LocalDate.now());
        samsPet.setName("Mr. Sparkles");
        owner2.getPets().add(samsPet);
        ownerService.save(owner2);
        Visit visit2 = new Visit();
        visit2.setPet(samsPet);
        visit2.setDate(LocalDate.now());
        visit2.setDescription("Needs a hug.");
        visitService.save(visit2);



        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ryan");
        vet1.setLastName("Torres");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Paul");
        vet2.setLastName("Smith");
        vet2.getSpecialties().add(savedSurgery);
        vet2.getSpecialties().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
