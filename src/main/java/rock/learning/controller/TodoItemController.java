package rock.learning.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rock.learning.model.TodoData;
import rock.learning.model.TodoItem;
import rock.learning.service.TodoItemService;
import rock.learning.util.AttributesName;
import rock.learning.util.Mappings;
import rock.learning.util.ViewNames;

import java.time.LocalDate;

@Slf4j
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
    public TodoData todoData() {
        return todoItemService.getData();
    }

    // ===== handler method ====
    // === http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(Model model) {
        TodoItem todoItem = new TodoItem("", "", LocalDate.now());
        model.addAttribute(AttributesName.TODO_ITEM, todoItem);
        return ViewNames.ADD_ITEM;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributesName.TODO_ITEM) TodoItem todoItem) {
        todoItemService.addItem(todoItem);
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id) {
        todoItemService.removeItem(id);
        return "redirect:/" + Mappings.ITEMS;
    }
}
