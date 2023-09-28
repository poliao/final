import java.util.ArrayList;
import java.util.List;

/**
 * Main class
 */
public class main {
    public static void main(String[] args) {  
        Employee employee = new Employee();
        employee.setAge(30); // Set the age of the employee
        employee.setName("John"); // Set the name of the employee+
        employee.setPosition("Manager");
        employee.setEmpID("EMP123");
        employee.addProject("ddddd", "dawdwdawd");

        employee.Showdetails();
         
        employee.setAge(30); // Set the age of the employee
        employee.setName("John"); // Set the name of the employee+
        employee.setPosition("Manager");
        employee.setEmpID("EMP123");
        employee.addProject("d", "dawdwdawd");
        employee.addProject("dddddwdd", "dawdwdawd");
       employee.Showdetails();
        
       
    }
}

interface Person {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

interface Job {
    String getPosition();
    void setPosition(String position);
    String getEmpID();
    void setEmpID(String empID);
}

class Employee implements Person, Job {
    private String name;
    private int age;
    private String position;
    private String empID;


private List<Project> projects = new ArrayList<>();

    public void Showdetails(){
        System.out.println("********************************************************");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " +getPosition());
        System.out.println("Employee ID: " + getEmpID());
      System.out.println("Projects:");

        for (Project project : projects) {
            System.out.println("  Project Name: " + project.getProjectName());
            System.out.println("  Description: " + project.getDescription());
            System.out.println();
        }
        

    }
     public void addProject(String projectName, String description) {
        Project project = new Project(projectName, description);

        projects.add(project);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getEmpID() {
        return empID;
    }

    @Override
    public void setEmpID(String empID) {
        this.empID = empID;
    }
}

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    
}
//GPT ONLY DONT COPE 