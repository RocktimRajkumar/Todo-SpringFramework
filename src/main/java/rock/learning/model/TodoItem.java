package rock.learning.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {

    // ==== Fields ====
    private int id;
    private String title;
    private String detais;
    private LocalDate deadline;

    // ==== constructor ====
    public TodoItem(String title, String detais, LocalDate deadline) {
        this.title = title;
        this.detais = detais;
        this.deadline = deadline;
    }
}
