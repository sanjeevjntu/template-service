package com.example.templeteservice.repository;

import com.example.templeteservice.controller.Fulfillment;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface OrderRepository extends PagingAndSortingRepository<Fulfillment, UUID>{

}
