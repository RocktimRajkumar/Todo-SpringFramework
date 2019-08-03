package rock.learning.model;

import lombok.Data;

import java.time.LocalDate;

@Data
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
