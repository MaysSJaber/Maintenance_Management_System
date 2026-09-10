package Screens.User;

import Core.User;
import Lib.MyString;
import Screens.Screen;

import java.io.IOException;
import java.util.Scanner;

public class UpdateUserScreen extends Screen {
    static Scanner in = new Scanner(System.in);
    private static void readUserInfo(User user) {

        System.out.println("\nEnter User Information:");

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
    private static void printUSerInfo(User user){
        System.out.println(MyString.tabs((byte)4)+"--------------------------------------------------------");
        System.out.println(MyString.tabs((byte)4)+" User Information : " );
        System.out.println(MyString.tabs((byte)4)+" User Name : " + user.getUserName());
        System.out.println(MyString.tabs((byte)4)+" Name : " + user.getName());
        System.out.println(MyString.tabs((byte)4)+" Age : " + user.getAge());
        System.out.println(MyString.tabs((byte)4)+" ID : " + user.getId());
        System.out.println(MyString.tabs((byte)4)+" Password : " + user.getPassword());
        System.out.println(MyString.tabs((byte)4)+" Phone : " + user.getPhone());
        System.out.println(MyString.tabs((byte)4)+" Adيaress : " + user.getAddress());
        System.out.println(MyString.tabs((byte)4)+" Email : " + user.getEmail());
        System.out.println(MyString.tabs((byte)4)+"--------------------------------------------------------");


    }
    public static void showUpdateUserScreen() throws IOException {

        drawScreenHeader("Update User",null);
        System.out.print("\n\nEnter User Name : ");
        String userName = in.nextLine();
        User u ;
        if((u = User.findUser(userName))!=null){
            printUSerInfo(u);

            readUserInfo(u);
            System.out.println("Are You Sure ?You Want Update User ?[y][n] ");
          Character sure = 'n';
          sure = in.next().charAt(0);
          if(Character.toLowerCase(sure)=='y'){

              u.update();

printUSerInfo(u);
              System.out.println("Updated Successfully :) . ");
              return;


          }
         else return ;
        }

        System.out.println("User Not Found :( . ");

    }



}
