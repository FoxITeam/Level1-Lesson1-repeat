package ru.foxit.grayfox;

/**
 * Author Main.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */


public class TestFinal {

    /**
     * Важные заметки, которые очень пригодятся на следующих занятиях.
     * + todo | CTRL + / - комментирования выделенных строк в коде.
     * + todo | Название переменных и методов начинаются с маленькой буквой, в то время как классы начинаются с большой буквы.
     * - todo | CTRL + F - поиск, CTRL + R - замена слова.
     * + todo | CTRL + SHIFT + ENTER - поставить точку с запятой и перейти на следующую строку.
     * + todo | CTRL + D - копировать ту строку, на которую мы нажали и оно вставит ее ниже.
     * + todo | Зажимаем ALT и выделяем, выделять будет квадратом.
     * + todo | Shift + F10 - запустить проект.
     * + todo | Shift + F6 - переименования название методов/переменных.
     * + todo | psvm - public static void Main
     * + todo | sout - System.out.println
     * + todo | Alt+ctrl+L - форматирование текста и кода в IDEA, удобная вещь.
     * + todo | Alt + Insert = Можно сгенерировать геттеры и сеттеры.
     * <p>
     * + todo | Что такое переменная - по факту это ссылка в адрес памяти и что по этому адресу лежит
     * + todo | определяется типом нашей переменной. Типы переменных бывают 2 видов - это
     * + todo | примитивные и ссылочные, их всего восемь.
     * + todo | Что такое метод - метод, он же в некоторых языках функция, это какое то поведение
     * + todo | если класс это описание объекта, допустим машина, то метод это его поведение, то что эта
     * + todo | машина может делать, например сигналить.
     * + todo | Что такое String в Java? Какой это тип данных?
     * + todo | String – это класс в Java, который прописан в пакете java.lang. Это не примитивный тип данных,
     * + todo | как int и long. Класс String представляет строковый набор символов.
     */

    static String strOne = "Привет";
    static String strTwo = "Привет"; //

    static int ints = 0; // простым языком Статика нужна для того, чтобы все методы видели переменную.
    // А если сделать метод статический, то он будет доступен для создания каких либо объектов его класса.

    /**
     * У статических методов есть ряд ограничений:
     * <p>
     * они могут вызывать только другие статические методы
     * они могут непосредственно осуществлять доступ только к статическим переменным
     * они не могут ссылаться на члены типа this или super
     * http://developer.alexanderklimov.ru/android/java/static.php
     */

    public static void main(String[] args) {
        ints = 12;
        System.out.println(ints);
        System.out.println("Привет 01");
        methodTest("Привет 02");
        methodTestTwo(4, 0);
        methodTestFree();
    }

    public static void methodTest(String test) {
        System.out.println(test);
    }

    public static void methodTestTwo(int one, int two) {
        System.out.println("Первое число: " + one + ".\nВторое число: " + two + ".");
    }

    private static void methodTestFree() {
        final int intsTwo = 0; // Нельзя изменять в коде


        int intsA = 0;
        int intsB = 0;
        if (intsA == intsB) {
            System.out.println("complete");
        } else {
            System.out.println("Failted");

        }

        if(strOne.equals(strTwo)){
            System.out.println("Отлично, строчки сравнили и все в порядке.");
        } else {
            System.out.println("Плохо, строчки отличаются.");
        }

    }
}

