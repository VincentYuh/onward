// Author: Loc Ha
package com.onward.app.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The LineItem class represents an item entity with necessary fields like
 * name, quantity, description, and price.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor // Project Lombok will generate getters and setters
public class LineItem 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Unique identifier for each line item
    private String name; // Name of the item
    private int quantity; // Description of the item
    private String description; // Quantity of the item
    private double price; // Price of the item
}
