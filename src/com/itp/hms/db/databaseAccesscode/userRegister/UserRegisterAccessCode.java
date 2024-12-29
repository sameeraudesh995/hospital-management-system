package com.itp.hms.db.databaseAccesscode.userRegister;

import com.itp.hms.db.CrudUtil;
import com.itp.hms.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRegisterAccessCode {

    public static boolean userRegister(User user) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("ÏNSERT INTO user VALUES(?,?,?,?,?,?,?,?)",
                user.getUser_id(),
                user.getEmp_num(),
                user.getRole(),
                user.getEmail(),
                user.getName(),
                user.getContact(),
                user.getPassword(),
                user.getJoin_date()
        );
    }

    public static String getLastId() throws SQLException, ClassNotFoundException {
        String lastid = null;
        ResultSet resultSet = CrudUtil.execute("SELECT user_id FROM user ORDER BY user_id DESC LIMIT 1");
        if (resultSet != null) {
            while (resultSet.next()) {
                return resultSet.getString("user_id");
            }
        }
        return null;
    }
}
