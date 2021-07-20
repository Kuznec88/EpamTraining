import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Employee> projectStructure = new HashMap<>(); // здесь не закончил
        List<String> taskList = new ArrayList<>(100);
        Map<String, List<String>> taskStructure = new HashMap<>();
        HashMap<Integer, String> employeeMap = new HashMap<>();

        String welcome = "Введите команду: ";

        System.out.println("Команды для работы с программой: " + "\n" +
                "emp - вывод в консоль всех сотрудников" + "\n" +                       // +
                "list - вывод всей таблицы" + "\n" +                                    // +
                "addemp + Имя сотрудника - добавляет сотрудника в базу" + "\n" +        // +
                "addproject + Имя + Проект - добавить сотрудника в проект" + "\n" +     //? +
                "addtask + Имя + Задача - добавляет задачу для сотрудника" + "\n" +     // +
                "deletetask + Имя - удаляет последнюю задачу на сотруднике" + "\n" +
                "deleteemp + Имя - удаляет пользователя и все его задачи " + "\n");     // +

        try {

            Class.forName("org.sqlite.JDBC");
            DataBase.open();
            System.out.println("База данных подключена"); // подключает базу данных

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n" + welcome);



        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();


            if (command.matches("addemp")) {                    // добавление сотрудника
                System.out.println("Введите имя сотрудника");
                String addname = scanner.nextLine();

                Employee employee = new Employee(Employee.getId(), addname);

                employeeMap.put(employee.id, employee.toString());
                DataBase.addEmployee(employee.id, addname);
                System.out.println(welcome);
            }

            if (command.matches("addtask")) {                   // добавление задачи

                System.out.println("Введите ID сотрудника:");
                int addEmployeeId = scanner.nextInt();

                if (employeeMap.containsKey(addEmployeeId)) {

                    System.out.println("Введите задачу:");
                    Scanner scanner1 = new Scanner(System.in);
                    String freshTask = scanner1.nextLine();

                    Task task = new Task(freshTask, Task.taskCount);
                    int numIndex = task.getTaskCount();
                    System.out.println(numIndex);

                    taskList.add(numIndex, freshTask);

                    taskStructure.put(Employee.getName(addEmployeeId), taskList);
                    DataBase.addTask(addEmployeeId, freshTask);

                }else {
                    System.out.println("Сотрудника с таким ID не существует. Сначала выполните команду \"addemp\"");
                }
                    System.out.println(taskStructure);
                System.out.println(welcome);


            }
                if (command.matches("addproject")) {                // должен был добавляться проект, но не сделал
                    Scanner scanner2 = new Scanner(System.in);

                    System.out.println("Введите ID сотрудника:");
                    int employeeID = scanner2.nextInt();

                    System.out.println("Введите название проекта:");
                    String project = scanner2.nextLine();

                    DataBase.addProject(employeeID, project);
                    System.out.println(welcome);
                }
                if (command.matches("emp")) {                       // возвращает список сотрудников
                    DataBase.getAllEmp();
                    System.out.println(welcome);
                }
                if (command.matches("deleteemp")) {                 // удаляет сотрудника из базы
                    System.out.println("Введите ID сотрудника: ");

                    Scanner scanner3 = new Scanner(System.in);
                    int deleteID = scanner3.nextInt();

                    employeeMap.remove(deleteID);

                    DataBase.deleteEmployee(deleteID);
                    System.out.println(welcome);
                }
                if (command.matches("list")) {                      // возвращает всю таблицу
                    DataBase.getList();
                    System.out.println(welcome);
                }
                if (command.matches("exit")) {                          // отключает бд
                    DataBase.close();
                    System.out.println();
                }
            }
        }
    }
