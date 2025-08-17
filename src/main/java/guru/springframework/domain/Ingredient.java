package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Ingredient
 * POJO/Entity for Ingredient
 */

@Getter
@Setter
public class Ingredient {

    private String id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
    private Recipe recipe;

    // Null constructor
    public Ingredient() {
    } // End Ingredient()

    // Constructor for Ingredient (3 params)
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    } // End Ingredient()

    // Constructor for Ingredient (4 params with Recipe)
    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    } // End Ingredient()

} // End Ingredient Class
