public class Task
{
    public static String content;
    public static int taskCount;


    public Task(String content, int taskCount)
    {
        this.content = content;
        taskCount++;
    }
    public int getTaskCount()
    {
        return taskCount++;
    }
}
