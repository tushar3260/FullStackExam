package org.example.fullstackexam.config;

import org.example.fullstackexam.model.Complaint;
import org.example.fullstackexam.repository.ComplaintRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ComplaintRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Complaint c1 = new Complaint();
                c1.setTitle("Leaking Tap");
                c1.setDescription("The tap in Room 102 is leaking continuously.");
                c1.setStatus("OPEN");
                c1.setCreatedAt(LocalDateTime.now());
                c1.setUpdatedAt(LocalDateTime.now());

                Complaint c2 = new Complaint();
                c2.setTitle("Wifi Issue");
                c2.setDescription("Wifi signal is very weak in the 2nd floor common area.");
                c2.setStatus("OPEN");
                c2.setCreatedAt(LocalDateTime.now().minusDays(1));
                c2.setUpdatedAt(LocalDateTime.now().minusDays(1));

                Complaint c3 = new Complaint();
                c3.setTitle("Broken Geyser");
                c3.setDescription("Geyser in Room 305 is not heating water.");
                c3.setStatus("OPEN");
                c3.setCreatedAt(LocalDateTime.now().minusDays(2));
                c3.setUpdatedAt(LocalDateTime.now().minusDays(2));

                repository.saveAll(Arrays.asList(c1, c2, c3));
                System.out.println("Demo complaints seeded!");
            }
        };
    }
}
