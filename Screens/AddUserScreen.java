/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Screens;

import Core.User;
import Core.User.SavedResult;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author maysj
 */
public class AddUserScreen extends Screen {

    static Scanner in = new Scanner(System.in);

    private static void readUserInfo(User user) {

        System.out.println("\nEnter User Information:");

        System.out.print("User Name: ");
        user.setUserName(in.nextLine());

        System.out.print("Name: ");
        user.setName(in.nextLine());

        System.out.print("Age: ");
        user.setAge(in.nextInt());
        in.nextLine();

        System.out.print("ID: ");
        user.setId(in.nextLine());

        System.out.print("Password: ");
        user.setPassword(in.nextLine());

        System.out.print("Phone: ");
        user.setPhone(in.nextLine());

        System.out.print("Address: ");
        user.setAddress(in.nextLine());

        System.out.print("Email: ");
        user.setEmail(in.nextLine());

    }

    public static void showAddNewUserScreen() throws IOException {

        Screen.drawScreenHeader("Add User", null);
        User u = new User();
         readUserInfo(u);

        SavedResult saveR = u.addUser();
        switch (saveR) {
            case SUCCESSFULLY_ADD:
        System.out.println("User added successfully :)");
                break;
            case FAILED_USER_ALREADY_EXISTS:
                 System.out.println("Failed to add user: User already exists :(");
                break;

        }

    }

}
