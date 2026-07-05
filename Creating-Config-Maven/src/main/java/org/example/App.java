package org.example;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {

        String message = "cognizant hands on";

        System.out.println("Original String : " + message);

        System.out.println("Capitalized : " +
                StringUtils.capitalize(message));

        System.out.println("Reversed : " +
                StringUtils.reverse(message));

    }

}