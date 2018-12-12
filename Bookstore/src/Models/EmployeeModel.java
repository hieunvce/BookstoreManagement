package Models;

import Entities.Employees;
import Helper.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeModel {
    private DBUtils database = new DBUtils();
    private Connection connection = null;

    public EmployeeModel() throws SQLException {
        connection = database.getConnection();
    }

    public List<Employees> getAllEmployeeList() throws SQLException {
        String selectAllEmployee = "SELECT * FROM employees";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAllEmployee);
        List<Employees> allEmployees = new ArrayList<Employees>();
        allEmployees = ResultSetToList(resultSet);
        return allEmployees;
    }

    public Employees getEmployee(int id) throws SQLException {
        String getEmployeeByID = "SELECT * FROM employees WHERE id = " + id;
        ResultSet resultSet = database.ExecuteQuerySQLStatement(getEmployeeByID);
        resultSet.first();
        String username = resultSet.getString("username");
        String password = resultSet.getString("password");
        String position = resultSet.getString("position");
        int salary = resultSet.getInt("salary");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        Employees employee = new Employees(username,password,firstName,lastName,position,salary);
        return employee;
    }

    public List<Employees> getEmployee(String name) throws SQLException {
        String selectEmployeeByName = "SELECT * FROM employees WHERE firstName LIKE '%" + name + "%'" +
                " OR lastName LIKE '%\"" + name + "\"%'";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectEmployeeByName);
        List<Employees> resultList = new ArrayList<Employees>();
        resultList = ResultSetToList(resultSet);
        return resultList;
    }

    public void addEmployee(Employees employee) {
        String username = employee.getUsername();
        String password = employee.getPassword();
        String position = employee.getPosition();
        int salary = employee.getSalary();
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        String employeeValue = "(\"" + username + "\",\"" + password + "\",\"" + firstName + "\",\"" + lastName + "\",\"" +
                position + "\",\"" + salary + "\")";
        String addEmployeeSQL = "INSERT INTO employees (username, password, firstName, lastName,position, salary)" +
                " VALUES " + employeeValue + ";";
        database.ExecuteCRUDSQLStatement(addEmployeeSQL);
    }

    public void removeEmployee(int id) {
        String deleteEmployeeSQL = "DELETE FROM employees WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(deleteEmployeeSQL);
    }

    public void updateEmployee(int id, Employees employee) {
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        String username = employee.getUsername();
        String password = employee.getPassword();
        String posititon = employee.getPosition();
        int salary = employee.getSalary();

        String set = "SET firstName=\"" + firstName + "\", " +
                "lastName=\"" + lastName + "\", " +
                "username=\"" + username + "\", " +
                "password=\"" + password + "\", " +
                "position=\"" + posititon + "\", " +
                "salary=\"" + salary + "\"";
        String updateEmployeeSQL = "UPDATE employees " + set + " WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(updateEmployeeSQL);
    }

    //-----------HELPER-------------------------------------------------------------------------------------
    public List<Employees> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Employees> list = new ArrayList<Employees>();
        while (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String position = resultSet.getString("position");
            int salary = resultSet.getInt("salary");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            Employees employee = new Employees(username,password,firstName,lastName,position,salary);
            list.add(employee);
        }
        return list;
    }
}
