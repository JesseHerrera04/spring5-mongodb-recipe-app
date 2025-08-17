package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on 8/1/2025 by Jesse H.
 * Package: Commands; Class: NotesCommand
 * Command Object for Notes
 */

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private String id;
    private String recipeNotes;

}
