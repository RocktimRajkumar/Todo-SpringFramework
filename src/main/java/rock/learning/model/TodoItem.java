package rock.learning.model;

import java.time.LocalDate;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetais() {
        return detais;
    }

    public void setDetais(String detais) {
        this.detais = detais;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoItem)) return false;

        TodoItem todoItem = (TodoItem) o;

        return id == todoItem.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detais='" + detais + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
