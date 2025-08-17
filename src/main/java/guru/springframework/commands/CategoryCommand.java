package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 8/1/2025 by Jesse H.
 * Package: Commands; Class: CategoryCommand
 * Command Object for Category
 */

@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private String id;
    private String description;
}
