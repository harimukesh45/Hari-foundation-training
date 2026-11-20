package Hashing;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************LOGIN SYSTEM************");
        System.out.println("Enter Username:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String password = sc.next();
        LoginService loginService = new LoginService();
        boolean isvalid = loginService.validate(username,password);
        if(isvalid)
        {
            System.out.println("Login Successful !");
            System.out.println("Welcome "+username);
        }
        else {
            System.out.println("Invalid Credentials");
            return;
        }
    }
}
