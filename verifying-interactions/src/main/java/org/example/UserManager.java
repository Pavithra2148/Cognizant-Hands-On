package org.example;

public class UserManager {

    private final NotificationService notificationService;

    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String name) {
        System.out.println("User Registered : " + name);

        notificationService.sendNotification("Welcome " + name);
    }
}