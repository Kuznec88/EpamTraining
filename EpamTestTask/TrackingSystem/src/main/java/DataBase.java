import java.sql.*;
import java.util.ArrayList;

public class DataBase {

    public DataBase() throws ClassNotFoundException, SQLException
    {

        DataBase dataBase = new DataBase();
        dataBase.open();
        dataBase.close();
    }
    static Connection connection;

    public static void open()                                               // подключение бд
    {
        try {
            DataBase.connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\katya\\Desktop\\sqlite\\users.db"); // поменять путь к файлу БД здесь
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    public static void addTask(int id, String task) {                                   // добавляет задачу привязывая к сотруднику

            String addTaskQuery = "INSERT INTO users ( id, task) " +
                    "VALUES ('" + Employee.getId() + "', ' " + task + "')";
            try {
                Statement statement = connection.createStatement();
                statement.executeUpdate(addTaskQuery);
                System.out.println("Запись добавлена");

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    public static void addProject(int id, String project)                           // добавляет в бд имя + проект
    {
        String addProjectQuery = "INSERT INTO users (name, project) " +
                "VALUES ('" + id + "', ' " + project + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(addProjectQuery);
            System.out.println("Запись добавлена");

            statement.close();
            DataBase.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static String getAllEmp()                                            // возвращает список сотрудников
    {
        String getEmpQuery = "SELECT NAME FROM users;";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getEmpQuery);
            boolean empty = true;
            while (resultSet.next())
            {
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                System.out.println(id + " " + name);
                empty = false;
            }
            if(empty)
            {
                System.out.println("Список сотрудников пуст.");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return "";
    }
    public static String getList()                                                  // возвращает список задач
    {
        String getEmpQuery = "SELECT * FROM users;";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getEmpQuery);

            boolean empty = true;
            while (resultSet.next())
            {
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                String task = resultSet.getString("task");
                String project = resultSet.getString("project");

                System.out.println(id + " " + name + " " + task + " " + project);
                empty = false;
            }
            if(empty)
            {
                System.out.println("Список пуст.");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return "";
    }
    public static void addEmployee(int id, String name)                                 // добавляет сотрудника в базу
    {
        String addNameQuery = "INSERT INTO users (id, name) " +
                "VALUES ('" + id + "', '" + name + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(addNameQuery);
            System.out.println("Запись добавлена");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void deleteTask() // удаляет последнюю задачу
    {

    }
    public static void deleteEmployee(int deleteID)                                            // удаляет сотрудника из базы
    {
        String addNameQuery = "DELETE FROM users WHERE id = ('" + deleteID + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(addNameQuery);
            System.out.println("Сотрудник удален.");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static Object getEmployee(int id) {                                                  // возвращает имя сотрудника по ID, но в классе Main не реализован
        String getEmpQuery = "SELECT '" + id + "', name FROM users;";
        try {
            Statement statement = connection.createStatement();
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
        return id;
    }
    public static void close() {                                                                    // Закрывает соединение с бд
        try {
            connection.close();
            System.out.println("База данных отключена");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}