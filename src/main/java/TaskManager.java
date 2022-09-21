import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskManager {

        private TaskService taskService;

        public boolean create(Task task) {
                return taskService.create(task);
        }
//        public boolean read(Task task) {
//                return taskService.read(task);
//        }
//        public boolean update(Task task) {
//                return taskService.update(task);
//        }
//        public boolean delete(Task task) {
//                return taskService.delete(task);
//        }

}