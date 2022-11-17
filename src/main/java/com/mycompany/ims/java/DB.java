package com.mycompany.ims.java;

import java.sql.*;
import org.jooq.*;
import org.jooq.impl.*;

public class DB {
    static String url = "jdbc:sqlite:C:\\Users\\Jericho Opsima\\DataGripProjects\\lms-2\\IMS.sqlite";
    
    public static Connection connect() {
        Connection connect = null;
        
        try {
            connect = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return connect;
    }
    
    public static DSLContext context() {
        DSLContext context = null;
        context = DSL.using(connect(), SQLDialect.SQLITE);
        
        return context;
    }

}