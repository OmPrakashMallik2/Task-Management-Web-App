package TaskManagementWebApp.backend.Services;

import TaskManagementWebApp.backend.Models.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImp implements TaskService {

    List<Task> tasks;

    public TaskServiceImp() {
        tasks = new ArrayList<>();
    }

    @Override
    public Task createTask( Task task) {
        Task newTask = new Task();
        newTask.setTaskId(task.getTaskId());
        newTask.setHeading(task.getHeading());
        newTask.setDescription(task.getDescription());
        tasks.add(newTask);
        return newTask;
    }

    @Override
    public List<Task> readTasks() {
        return tasks;
    }

    @Override
    public Task readSingleTask(Integer taskId) throws Exception {
        Task newTask = null;
        for (Task task1 : tasks) {
            if (task1.getTaskId() == taskId) {
                newTask = task1;
                break;
            }
        }

        if (newTask == null) {
            throw new Exception("task not found");
        }

        return newTask;
    }

    @Override
    public Task updateTask(Task task, Integer taskId) throws Exception {

        Task newTask = null;
        for (Task task1 : tasks) {
            if (task1.getTaskId() == taskId) {
                newTask = task1;
                break;
            }
        }

        if (newTask == null) {
            throw new Exception("task not found");
        }

        Task oldTask = newTask;
        tasks.remove(oldTask);

        if (task.getTaskId() != null) {
            newTask.setTaskId(task.getTaskId());
        }
        if (task.getHeading() != null) {
            newTask.setHeading(task.getHeading());
        }
        if (task.getDescription() != null) {
            newTask.setDescription(task.getDescription());
        }

        tasks.add( newTask);
        return newTask;
    }

    @Override
    public String deleteTask(Integer taskId) throws Exception {
        Task newTask = null;
        for (Task task1 : tasks) {
            if (task1.getTaskId() == taskId) {
                newTask = task1;
                break;
            }
        }

        if (newTask == null) {
            throw new Exception("task not found");
        }

        tasks.remove(newTask);
        return "Task deleted successfully";
    }
}
