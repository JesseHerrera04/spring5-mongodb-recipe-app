package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: Notes
 * POJO/Entity for Notes
 */

@Getter
@Setter
public class Notes {

    @Id
    private String id;
    private String recipeNotes;
} // End Notes Class
