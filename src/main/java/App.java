import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final int EXIT_STATUS_SUCCESS = 0;
    private static final Scanner scanner = new Scanner(System.in).useDelimiter("---");
    private static final List<String[]> dataLines = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            executeUserAction(getActionFromUser());
        }


    }

    private static void executeUserAction(int actionFromUser) {
        switch (actionFromUser) {
            case 1: {
                CsvManagerImpl.saveToStorage(getTaskDetails());
                break;
            }
            case 2: {
                CsvManagerImpl.readingTodoListAndDisplayingIt();
                break;
            }
//            case 3 -> updateExisitingTask();
//            case 4 -> deleteTaskByTaskName();
            case 5: {
                System.exit(EXIT_STATUS_SUCCESS);
                break;
            }
        }
    }



    private static Task getTaskDetails() {
        Task task = new Task();
        System.out.println("Please insert task name: ");
        task.setName(scanner.nextLine());
        System.out.println("Please insert task description: ");
        task.setDescription(scanner.nextLine());
        System.out.println("Please insert task deadline time: ");
        task.setDeadlineTime(DateTimeUtils.stringToDateTime(scanner.nextLine()));
        System.out.println("Please insert assigned user: ");
        task.setAssignedUser(scanner.nextLine());

        return task;
    }

    private static int getActionFromUser() {
        System.out.println("===TODO LIST===");
        System.out.println("Choose an option");
        System.out.println("1. Add task to the list.");
        System.out.println("2. Display tasks.");
        System.out.println("3. Update existing task.");
        System.out.println("4. Delete existing task.");
        System.out.println("5. Exit.");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

}