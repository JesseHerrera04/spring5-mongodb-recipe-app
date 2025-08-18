package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Created on 7/19/2025 by Jesse H.
 * Package: Domain; Class: Category
 * POJO/Entity for Recipe Category
 */

@Getter
@Setter
@Document
public class Category {

    @Id
    private String id;
    private String description;

    @DBRef
    private Set<Recipe> recipes;

} // End Category Class
