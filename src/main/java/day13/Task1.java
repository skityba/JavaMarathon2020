package day13;

import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Cole");
        User user2 = new User("Peter");
        User user3 = new User("Alex");

        user1.sendMessage(user2, "hello!");
        user1.sendMessage(user2, "hi!");
        user2.sendMessage(user1, "hello!");
        user2.sendMessage(user1, "hi!");
        user2.sendMessage(user1, "hurra!");
        user3.sendMessage(user1, "hello!");
        user3.sendMessage(user1, "hi!");
        user3.sendMessage(user1, "hurra!");
        user1.sendMessage(user3, "hello!");
        user1.sendMessage(user3, "hi!");
        user1.sendMessage(user3, "hurra!");
        user3.sendMessage(user1, "salut!");

        showDialog(user1, user3);
    }
}
