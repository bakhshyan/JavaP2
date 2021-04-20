package JavaP2.dataimport;


import JavaP2.dataimport.Car;

import java.sql.*;
import java.util.ArrayList;

public class SQLParser {
    private String conectionUrl = "jdbc:postgresql://localhost:5432/Garage";
    private String userName = "postgres";
    private String password = "";
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    ArrayList<Car> garage;

    private void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(conectionUrl, userName, password);
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from public.\"Cars\";");
    }

    public ArrayList<Car> getGarageArray() throws ClassNotFoundException, SQLException {

        createConnection();
        garage = new ArrayList<>();
        while (resultSet.next()) {

            garage.add(new Car(resultSet.getString("Name")
                    , resultSet.getString("Model"),
                    resultSet.getString("Colour"),
                    resultSet.getInt("Price")
                    , resultSet.getDouble("FuelConsumption")));

        }

        return garage;

    }

    public void closeConnection() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }
}

