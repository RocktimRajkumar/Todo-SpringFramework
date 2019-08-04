package rock.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import rock.learning.model.TodoData;
import rock.learning.service.TodoItemService;
import rock.learning.util.Mappings;
import rock.learning.util.ViewNames;

@Controller
public class TodoItemController {

    //==== Fields ====
    private final TodoItemService todoItemService;

    // === constructor ====

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // === model attributes ===
    @ModelAttribute
    public TodoData todoData(){
        return todoItemService.getData();
    }

    // ===== handler method ====
    // === http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
