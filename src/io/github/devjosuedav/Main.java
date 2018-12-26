public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;
    private String id;

    /**
     * Create a new employee
     * @param name of new employee
     * @param idNumber of new employee
     * @param department of new employee
     * @param position of new employee
     */
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    /**
     * Create a new employee
     * @param name of new employee
     * @param idNumber of new employee
     */
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    /**
     * Create an empty employee
     */
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    /**
     * @return name of employee
     */
    public String getName() {
        return name;
    }

    /**
     * @param name of employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return id number of employee
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber of employee
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return department of employee
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department of employee
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return position of employee
     */
    public String getPosition() {
        return position;
    }
}
