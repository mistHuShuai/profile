package com.dyja21.dao;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//@Component
public class BasicLjd implements Dataxh {
    private String password;
    private String username;
    private String url;
    private String driverclass;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDriverclass(String driverclass) {
        this.driverclass = driverclass;
    }

    @Override
    public Connection getConnection() {
        Connection fhz=null;
//        jdbc:sqlserver://localhost:1433;databasename=abc
//        com.microsoft.sqlserver.jdbc.SQLServerDriver
        try {
            Class.forName(driverclass);
            fhz = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fhz;
    }
}
