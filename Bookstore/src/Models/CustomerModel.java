package Models;

import Entities.Customers;
import Helper.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerModel {
    private DBUtils database = new DBUtils();
    private Connection connection = null;

    public CustomerModel() throws SQLException {
        connection = database.getConnection();
    }

    public List<Customers> getAllCustomerList() throws SQLException {
        String selectAllCustomer = "SELECT * FROM customers";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectAllCustomer);
        List<Customers> allCustomers = new ArrayList<Customers>();
        allCustomers = ResultSetToList(resultSet);
        return allCustomers;
    }

    public Customers getCustomer(int id) throws SQLException {
        String getCustomerByID = "SELECT * FROM customers WHERE id = " + id;
        ResultSet resultSet = database.ExecuteQuerySQLStatement(getCustomerByID);
        resultSet.first();
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        String email = resultSet.getString("email");
        String phone = resultSet.getString("phone");
        String address = resultSet.getString("address");

        Customers customer = new Customers(firstName, lastName, email,phone,address);
        return customer;
    }

    public List<Customers> getCustomer(String name) throws SQLException {
        String selectCustomerByName = "SELECT * FROM customers WHERE firstName LIKE '%" + name + "%'" +
                " OR lastName LIKE '%\"" + name + "\"%'";
        ResultSet resultSet = database.ExecuteQuerySQLStatement(selectCustomerByName);
        List<Customers> resultList = new ArrayList<Customers>();
        resultList = ResultSetToList(resultSet);
        return resultList;
    }

    public void addCustomer(Customers customer) {
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        String email = customer.getEmail();
        String phone = customer.getPhone();
        String address = customer.getAddress();

        String customerValue = "(\"" + firstName + "\",\"" + lastName + "\",\"" +
                email + "\",\"" + phone + "\",\"" + address + "\")";
        String addCustomerSQL = "INSERT INTO customers (firstName, lastName, email, phone, address)" +
                " VALUES " + customerValue + ";";
        database.ExecuteCRUDSQLStatement(addCustomerSQL);
    }

    public void removeCustomer(int id) {
        String deleteCustomerSQL = "DELETE FROM customers WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(deleteCustomerSQL);
    }

    public void updateCustomer(int id, Customers customer) {
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        String email = customer.getEmail();
        String phone = customer.getPhone();
        String address = customer.getAddress();

        String set = "SET firstName=\"" + firstName + "\", " +
                "lastName=\"" + lastName + "\", " +
                "email=\"" + email + "\", " +
                "phone=\"" + phone + "\", " +
                "address=\"" + address + "\"";

        String updateCustomerSQL = "UPDATE customers " + set + " WHERE id=" + id;
        database.ExecuteCRUDSQLStatement(updateCustomerSQL);
    }

    //-----------HELPER-------------------------------------------------------------------------------------
    public List<Customers> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Customers> list = new ArrayList<Customers>();
        while (resultSet.next()) {
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");

            Customers customer = new Customers(firstName, lastName, email,phone,address);
            list.add(customer);
        }
        return list;
    }
}

