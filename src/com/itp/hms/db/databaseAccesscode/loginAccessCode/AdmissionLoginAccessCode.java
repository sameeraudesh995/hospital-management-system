package com.itp.hms.db.databaseAccesscode.loginAccessCode;

import com.itp.hms.db.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdmissionLoginAccessCode {
    public  String admissionLogin(String userId) throws SQLException, ClassNotFoundException {
        String userName = null;
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM user WHERE user_id=? AND role='Nurse'",userId);
        if (resultSet != null) {
            while (resultSet.next()) {
                return resultSet.getString("password");
            }
        }
        return null;
    }
}
