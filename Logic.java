package ru.foxit.grayfox;

public class Logic {


    public static void main(String[] args) {


        //Проверка строк:
        // Зажимая ctrl и нажимая к примеру на String, можно посмотреть что стринг делает и какое у него поведение.
        String str1 = "Привет!";
        String str2 = "Привет!";
        if (str1.equals(str2)) { // проверка строк делается с помощью equals
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }

        // еще пример с выбором
        boolean choise = false;
        if(choise) {
            System.out.println("Выбор верен");
        } else {
            System.out.println("Вы правы");
        }

        // Красная и синяя пилюля
//        int red = 1; // красная
//        int blue = 2; // синяя
//        int choise = 1; // Выбор
//        if (choise == red) {
//            System.out.println("Добро пожаловать в матрицу");
//        } else {
//            System.out.println("Matrix has you...");
//        }
    }
}
