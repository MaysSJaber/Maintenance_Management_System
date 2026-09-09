/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Screens;

import Lib.InputValidate;
import Lib.MyString;

import java.io.IOException;

/**
 *
 * @author maysj
 */
public class UserScreen extends Screen {

   public enum UserManagementMenu {

        SHOW_ALL_USERS(1),
        ADD_NEW_USER(2),
        DELETE_USER(3),
        UPDATE_USER(4),
        GO_BACK(5);

        private final short enumOptionValue;

        UserManagementMenu(int value) {
            this.enumOptionValue = (short) value;
        }

        public short getEnumOptionValue() {
            return enumOptionValue;
        }
    }


    private static UserManagementMenu fromValue(short value) {

        for (UserManagementMenu option : UserManagementMenu.values()) {

            if (option.getEnumOptionValue() == value) {
                return option;
            }
        }

        return null;
    }

    private static UserManagementMenu readOption(String Message) {

        System.out.println(MyString.tabs((byte) 6) + Message);

        short option = InputValidate.readShortNumberBetween(
                (short) 1,
                (short) 5
        );

        return fromValue(option);
    }


private static void showAllUserScreen() throws IOException {

       ShowAllUserScreen.showAllUserScreen();
}

private static void addUserScreen() throws IOException {

       AddUserScreen.showAddNewUserScreen();
}

private static void deleteUserScreen() throws IOException{

       DeleteUserScreen.showDeleteScreen();;
}

private static void updateUSerScreen() throws IOException{

       UpdateUserScreen.showUpdateUserScreen();;

}

private static void goBackUserMenue() throws IOException {

    System.out.println("\n\nPress Enter to go back to User Menu...");
    new java.util.Scanner(System.in).nextLine();

       Screen.clearScreen();
       showUserMenue();

}

    private static void performUserMenue(UserManagementMenu option) throws IOException {

switch (option) {

            case SHOW_ALL_USERS:{
                Screen.clearScreen();
                showAllUserScreen();
                goBackUserMenue();

                break;
            }



            case ADD_NEW_USER:{
                Screen.clearScreen();
                addUserScreen();
                goBackUserMenue();

                break;
            }


            case DELETE_USER:{
                Screen.clearScreen();
                deleteUserScreen();
                goBackUserMenue();

                break;
            }

            case UPDATE_USER:{
                Screen.clearScreen();
                updateUSerScreen();
                goBackUserMenue();
                break;
            }

            case GO_BACK:{

                System.out.println("logout screen will be here");
                return;


            }

        }
}


    public static void showUserMenue() throws IOException {

        drawScreenHeader("User Manegment", null);

        System.out.print("\n\n");
        System.out.println(MyString.tabs((byte) 6)
                + "************************************************************"
        );
        System.out.println(MyString.tabs((byte) 6)
                + "************************************************************"
        );
        System.out.println(MyString.tabs((byte) 6) + "[1] Show All User ");
        System.out.println(MyString.tabs((byte) 6) + "[2] Add User ");
        System.out.println(MyString.tabs((byte) 6) + "[3] Delete User ");
        System.out.println(MyString.tabs((byte) 6) + "[4] Update User ");
        System.out.println(MyString.tabs((byte) 6) + "[5] Go Back ");
      
        System.out.println(MyString.tabs((byte) 6)
                + "************************************************************"
        );
        System.out.println(MyString.tabs((byte) 6)
                + "************************************************************"
        );
        performUserMenue(readOption("Enter your choice [ 1 - 5 ] ? "));
    }
}
