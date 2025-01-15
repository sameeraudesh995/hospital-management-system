package com.itp.hms.db.databaseAccesscode.admin;

import com.itp.hms.db.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultantRegisterAccessCode {

    public static String getLastId() throws SQLException, ClassNotFoundException {
        String lastid = null;
        ResultSet resultSet = CrudUtil.execute("SELECT id FROM consultant ORDER BY id DESC LIMIT 1");
        if (resultSet != null) {
            while (resultSet.next()) {
                return resultSet.getString("id");
            }
        }
        return null;
    }
}
