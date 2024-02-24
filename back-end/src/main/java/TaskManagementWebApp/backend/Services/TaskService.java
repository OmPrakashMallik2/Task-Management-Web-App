package TaskManagementWebApp.backend.Services;

import TaskManagementWebApp.backend.Models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    Task createTask(Task task);

    List<Task> readTasks();

    Task readSingleTask(Integer taskId) throws Exception;

    Task updateTask(Task task, Integer taskId) throws Exception;

    String deleteTask(Integer taskId) throws Exception;
}
