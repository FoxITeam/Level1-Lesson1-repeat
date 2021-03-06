package ru.foxit.grayfox;

/**
 * Author Logic.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */ //

public class Logic {

    /**
     * Важные заметки, которые очень пригодятся на следующих занятиях.
     * <p>
     * + что мы повторили или используем в коде
     * - то что мы не повторяли или не приходилось использовать в коде
     * o - то что мы узнали на этом уроке и нужно повторить на следующем.
     * ++ todo | ctrl + F2 - остановить проект.
     * ++ todo | fori - сокращение цикла for обычная, itar - сокрашения цикла for с массивом, iter - еще не изучали, хотя не пизжу, забыл =D
     * Примечание: fori sout psvm itar и подобные сокращения работают только в методах.
     * ++ todo | с помощью жука (дебагера) кликаем по нужному участку кода, запускаем и шагаем F8 по шагам, смотрим на выполнение кода.
     * ++ todo | alt + Enter (Наводим на if или switch и мы можем переконвертировать их) с if в switch или наоборот.
     * ++ todo | CTRL + / - комментирования выделенных строк в коде.
     * ++ todo | Название переменных и методов начинаются с маленькой буквой, в то время как классы начинаются с большой буквы.
     * -+ todo | CTRL + F - поиск, CTRL + R - замена слова.
     * +- todo | CTRL + SHIFT + ENTER - поставить точку с запятой и перейти на следующую строку.
     * ++ todo | CTRL + D - копировать ту строку, на которую мы нажали и оно вставит ее ниже.
     * ++ todo | Зажимаем ALT и выделяем, выделять будет квадратом.
     * ++ todo | Shift + F10 - запустить проект.
     * ++ todo | Shift + F6 - переименования название методов/переменных.
     * ++ todo | psvm - public static void Main
     * ++ todo | sout - System.out.println
     * ++ todo | Alt+ctrl+L - форматирование текста и кода в IDEA, удобная вещь.
     * ++ todo | Alt + Insert = Можно сгенерировать геттеры и сеттеры.
     * ++ todo | Что такое переменная - по факту это ссылка в адрес памяти и что по этому адресу лежит
     * ++ todo | определяется типом нашей переменной. Типы переменных бывают 2 видов - это
     * ++ todo | примитивные и ссылочные, их всего восемь.
     * ++ todo | Что такое метод - метод, он же в некоторых языках функция, это какое то поведение
     * ++ todo | если класс это описание объекта, допустим машина, то метод это его поведение, то что эта
     * ++ todo | машина может делать, например сигналить.
     * ++ todo | Что такое String в Java? Какой это тип данных?
     * ++ todo | String – это класс в Java, который прописан в пакете java.lang. Это не примитивный тип данных,
     * ++ todo | как int и long. Класс String представляет строковый набор символов.
     * ++ todo | Везде, где мы делаем константную проверку, используем свитч, это экономит ресурсы. if проверяет все, а вот свитч
     * ++ todo | остановиться на нужном условии и выйдет из блока кода, не станет дальше проверять, в отличии от if.
     * ++ todo | Рефакторинг это улучшение кода, когда вы его написали, код который работает, но скорее всего вы его с первого раза не написали
     * ++ todo | его идеально, нам нужно его обработать, обработка напильников, полировка, шлифовка, шпаклей херовка, цементировка, синонимыСловафрафаф тфу...
     */

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
