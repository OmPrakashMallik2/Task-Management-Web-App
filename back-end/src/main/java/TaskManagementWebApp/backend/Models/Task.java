package TaskManagementWebApp.backend.Models;

public class Task {
    private Integer taskId;
    private String heading;
    private String description;

    public Task() {
    }

    public Task(Integer taskId ,String heading, String description) {
        this.taskId = taskId;
        this.heading = heading;
        this.description = description;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
