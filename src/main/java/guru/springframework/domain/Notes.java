package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Notes
 * POJO/Entity for Notes
 */

@Getter
@Setter
public class Notes {

    private String id;
    private Recipe recipe;
    private String recipeNotes;

} // End Notes Class
