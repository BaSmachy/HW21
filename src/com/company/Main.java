package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Days day = Days.Tuesday;
        System.out.print(day+": ");
//        switch (day){
//            case Monday -> System.out.println("Понедельник урок прогмаммирование");
//            case Tuesday -> System.out.println("Вторник практическое занятие");
//            case Wednesday -> System.out.println("Среда урок программирование");
//            case Thursday -> System.out.println("Четверг практическое занятие");
//            case Friday-> System.out.println("Пятница урок праграммирование");
//            case Saturday -> System.out.println("Суббота в 12:00 практическое занятие");
//            case Sunday -> System.out.println("Воскресенье выходные");
//
//            }
        if (day.equals(Days.Monday)){
            System.out.println("Понедельник урок прогмаммирование");
        }else if(day.equals(Days.Tuesday)){
            System.out.println("Вторник практическое занятие");
        }else if(day.equals(Days.Wednesday)){
            System.out.println("Среда урок программирование");
        }else if(day.equals(Days.Thursday)){
            System.out.println("Четверг практическое занятие");
        }else if(day.equals(Days.Friday)){
            System.out.println("Пятница урок праграммирование");
        }else if(day.equals(Days.Saturday)){
            System.out.println("Суббота в 12:00 практическое занятие");
        }else if(day.equals(Days.Sunday)){
            System.out.println("Воскресенье выходные");
        }
    }
}
