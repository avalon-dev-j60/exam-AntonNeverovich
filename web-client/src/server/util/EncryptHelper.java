package server.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class EncryptHelper {

    private EncryptHelper() {}

    public static String md5(String source) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(source.getBytes());
            byte[] bytes = md5.digest();
            return new String((bytes));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
