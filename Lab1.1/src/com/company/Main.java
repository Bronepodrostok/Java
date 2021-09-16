package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonTest person = new PersonTest();
        try {
            System.out.print("Введите возраст: ");
            person.setAge(scanner.nextInt());

            System.out.print("Введите рост: ");
            person.setHeight(scanner.nextInt());

            System.out.print("Введите имя: ");
            person.setName(scanner.next());

            System.out.print("Введите гендер(м/ж/в/д): ");
            String gender = scanner.next();
            switch (gender) {
                case "м" -> person.setGender(Gender.MALE);
                case "ж" -> person.setGender(Gender.FEMALE);
                case "в" -> person.setGender(Gender.GENDERFLUID_HELISEXUAL);
                default -> person.setGender(Gender.OTHERS);
            }
        }
        catch (Exception exception) {
            System.out.println(exception);
            System.exit(0);
        }

        System.out.println(person);
    }
}

