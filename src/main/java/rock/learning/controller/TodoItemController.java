package rock.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import rock.learning.model.TodoData;
import rock.learning.util.Mappings;
import rock.learning.util.ViewNames;

@Controller
public class TodoItemController {

    // === model attributes ===
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    // ===== handler method ====
    // === http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
