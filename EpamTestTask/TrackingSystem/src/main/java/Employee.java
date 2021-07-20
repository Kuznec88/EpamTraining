import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class Employee
{
                                                                    // Поля класса
        public int id = 1;
        public static String name;
        public static int employeeCount = 1;


        public Employee(int id, String name)                        // Конструктор
        {
            this.id = id;
            this.name = name;
            employeeCount++;
        }
        public static int getId()
        {
            return employeeCount;
        }
        public static String getName(int id)                            // получает имя сотрудника из бд
        {
            String getEmpQuery = "SELECT '" + id + "', name FROM users;";
            try {
                Statement statement = DataBase.connection.createStatement();
                ResultSet resultSet = statement.executeQuery(getEmpQuery);
                boolean empty = true;
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    id = resultSet.getInt("id");
                    System.out.println(id + " " + name);
                    empty = false;
                }
                if (empty) {
                    System.out.println("Список сотрудников пуст.");
                }

            } catch (Exception ex) {
                ex.getMessage();
            }
            return name;
        }
        public static Employee getInstance(int id, String name)                             // создавал чтоб использовать, но не использовал
        {
            return new Employee(id,name);
        }
    }

