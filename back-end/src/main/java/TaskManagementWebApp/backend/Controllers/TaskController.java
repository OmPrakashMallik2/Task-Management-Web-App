package TaskManagementWebApp.backend.Controllers;

import TaskManagementWebApp.backend.Models.Task;
import TaskManagementWebApp.backend.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/task")
    public Task addTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.readTasks();
    }

    @GetMapping("/tasks/{taskId}")
    public Task getSingleTask(@PathVariable Integer taskId) throws Exception {
        return taskService.readSingleTask(taskId);
    }

    @PutMapping("/tasks/{taskId}")
    public Task updateTask(@RequestBody Task task, @PathVariable Integer taskId) throws Exception {
        return taskService.updateTask(task, taskId);
    }

    @DeleteMapping("/tasks/{taskId}")
    public String deleteTask(@PathVariable Integer taskId) throws Exception {
        return taskService.deleteTask(taskId);
    }
}
