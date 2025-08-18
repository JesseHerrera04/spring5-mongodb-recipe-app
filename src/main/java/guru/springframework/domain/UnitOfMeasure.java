package guru.springframework.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created on 7/16/2025 by Jesse H.
 * Package: Domain; Class: UnitOfMeasure
 * Pojo/Entity for Unit of Measure
 */

@Getter
@Setter
@Document
public class UnitOfMeasure {

    @Id
    private String id;
    private String description;

} // End UnitOfMeasure Class
