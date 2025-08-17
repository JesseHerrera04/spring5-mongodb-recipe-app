package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Domain; Class: Category
 * POJO/Entity for Recipe Category
 */

@Getter
@Setter
public class Category {

    private String id;
    private String description;
    private Set<Recipe> recipes;

} // End Category Class
