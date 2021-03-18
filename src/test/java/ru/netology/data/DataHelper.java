package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {}
    @Value
    public static class AuthInfo {
        String login;
        String password;
    }
    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }
    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }
    @Value
    public static class VerificationCode {
        String code;
    }
    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

        public static String getCardNumberOne() {
            return new String("5559 0000 0000 0001");
        }

        public static String getCardNumberTwo() {
            return new String("5559 0000 0000 0002");
    }
}