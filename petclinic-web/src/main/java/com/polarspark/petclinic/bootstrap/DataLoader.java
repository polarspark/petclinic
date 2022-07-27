package com.polarspark.petclinic.bootstrap;

import com.polarspark.petclinic.model.Owner;
import com.polarspark.petclinic.model.Pet;
import com.polarspark.petclinic.model.PetType;
import com.polarspark.petclinic.model.Vet;
import com.polarspark.petclinic.services.OwnerService;
import com.polarspark.petclinic.services.PetTypeService;
import com.polarspark.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

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

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ryan");
        vet1.setLastName("Torres");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Paul");
        vet2.setLastName("Smith");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
