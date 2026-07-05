package org.example;

public class UserService {

    private final ExternalApi api;

    public UserService(ExternalApi api) {
        this.api = api;
    }

    public String fetchUser() {
        return api.getUserName();
    }

}