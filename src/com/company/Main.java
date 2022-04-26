package com.company;

import java.util.Locale;

public class Main {

     public static void main(String[] args) {
	// write your code here
    //Задача1
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;
    System.out.println("ФИО сотрудника - " + fullName);


    //Задача2
    String fullName1 = "Ivanov Ivan Ivanovich";
    String fullName2 = fullName.toUpperCase();
    System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName2);


    //Задача3
    String fullName3 = "Иванов Семён Семёнович";
    String fullNameReplace = fullName3.replace('ё', 'е');
    System.out.println("Данные ФИО сотрудника - " + fullNameReplace);


    }
}