package rock.learning.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import rock.learning.model.TodoData;
import rock.learning.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    // ==== fields ====
    @Getter
    private final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }
}
