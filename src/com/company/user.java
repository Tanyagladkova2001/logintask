package com.company;
public class user {
    public user(String username, String password) {
        login();
    }

    public static void login() {
        int attempts = 3;
        while (true) {
            System.out.print("Insert your username: ");
            UserService.getLogin= UserService.SCANNER.nextLine();
            System.out.print("Insert your password: ");
            UserService.getPassword = UserService.SCANNER.nextLine();
            {
                if (UserService.getAttemptsOfEnter > 0) {
                    System.out.println("You insert password three times! You're blocked");
                } else
                    System.out.println("User is blocked!");
                UserService.blockUser();
            }
        }
    }
}


