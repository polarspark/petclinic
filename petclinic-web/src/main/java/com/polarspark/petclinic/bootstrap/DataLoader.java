package com.polarspark.petclinic.bootstrap;

import com.polarspark.petclinic.model.Owner;
import com.polarspark.petclinic.model.Vet;
import com.polarspark.petclinic.services.OwnerService;
import com.polarspark.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Sam");
        owner1.setLastName("Axe");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ryan");
        vet1.setLastName("Torres");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Paul");
        vet2.setLastName("Smith");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
