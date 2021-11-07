package com.company;
import java.util.Scanner;
public class UserService {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int getAttemptsOfEnter= 3;
    public static String getPassword;
    public static String getLogin;

    private static String blockUser;
    private static String login;
    private static String password;
    private static String attemptsOfEnter;

    public static void blockUser() {
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static void setLogin(String login) {
        UserService.login = login;
    }

    public static void setPassword(String password) {
        UserService.password = password;
    }
    public static void setBlockUser (String blockUser){
        UserService.blockUser = blockUser;
    }
    public String getBlockUser() {
        return blockUser;
    }
    public static void setAttemptsOfEnter (String attemptsOfEnter){
        UserService.attemptsOfEnter = attemptsOfEnter;
    }
    public String getAttemptsOfEnter() {
        return attemptsOfEnter;
    }

    public void login(user username, String user) {

    }
}
