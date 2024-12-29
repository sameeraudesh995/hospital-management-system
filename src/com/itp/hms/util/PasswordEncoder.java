package com.itp.hms.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncoder {
    public static String encode(String password) {
        return BCrypt.hashpw(password,
                BCrypt.gensalt(15));
    }
    public static boolean
    check(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
