package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
    }

    @Override
    public void run(String... args) throws Exception {


    }

}
