import java.time.LocalDateTime;
import java.util.Objects;

public class Task {

    private String name;
    private String description;
    private LocalDateTime deadlineTime;
    private String assignedUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(LocalDateTime deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(name).append(", ");
        sb.append(description).append(", ");
        sb.append(deadlineTime).append(", ");
        sb.append(assignedUser).append(" ]");

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;

        return Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(deadlineTime, task.deadlineTime) && Objects.equals(assignedUser, task.assignedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, deadlineTime, assignedUser);
    }

}
