package com.example.demo.dao;

import com.example.demo.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

@CrossOrigin("http://localhost:4200/")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {}
