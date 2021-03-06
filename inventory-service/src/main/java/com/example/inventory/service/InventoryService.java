package com.example.inventory.service;

import com.example.inventory.model.Inventory;
import com.example.inventory.repository.InventoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Slf4j
public class InventoryService {
    private InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory getInventory(Long productId) {
        log.info("Inventory lookup request for productId: {}",
                productId);
        Optional<Inventory> inventory = inventoryRepository.
                findById(productId);
        return inventory.orElse(Inventory.builder()
                .inventoryId(1l)
                .productId(productId)
                .price(200)
                .quantity(2)
                .build());
    }
}
