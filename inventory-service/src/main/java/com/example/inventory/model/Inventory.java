package com.example.inventory.model;

import lombok.Builder;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Table(name = "Inventory")
public class Inventory {
    @Id
    @GeneratedValue
    private Long inventoryId;
    Long productId;
    Integer price;
    Integer quantity;

    public Inventory() {
        // empty
    }

    public Inventory(Long inventoryId, Long productId, Integer price, Integer quantity) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }


}
