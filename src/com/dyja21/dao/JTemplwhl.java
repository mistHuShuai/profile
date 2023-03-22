package com.dyja21.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JTemplwhl {

    private Dataxh dataxh;

    public void setDataxh(Dataxh dataxh) {
        this.dataxh = dataxh;
    }

    public void updatea(String sql){

        Connection connection=null;
        try {
            connection = dataxh.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
