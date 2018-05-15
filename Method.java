package ru.foxit.grayfox;

/**
 * Author Method.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

public class Method {
    public static void main(String[] args) {
        System.out.println(greatings("Артур"));
    }

    static String greatings(String name) {
        return "Привет, " + name + "!";
    }

//    public static void main(String[] args) {
//        String name = "Артур";
//        String hello = greatings(name);
//        System.out.println(hello);
//    }
//
//    static String greatings(String name) {
//        String greating = "Привет, " + name + "!";
//        return greating;
//    }

    /** Важные заметки, которые очень пригодятся на следующих занятиях.
     * todo | CTRL + / - комментирования выделенных строк в коде.
     * todo | Название переменных и методов начинаются с маленькой буквой, в то время как классы начинаются с большой буквы.
     * todo | CTRL + F - поиск, CTRL + R - замена слова.
     * todo | CTRL + SHIFT + ENTER - поставить точку с запятой и перейти на следующую строку.
     * todo | CTRL + D - копировать ту строку, на которую мы нажали и оно вставит ее ниже.
     * todo | Зажимаем ALT и выделяем, выделять будет квадратом.
     * todo | Shift + F10 - запустить проект.
     * todo | Shift + F6 - переименования название методов/переменных.
     * todo | psvm - public static void Main
     * todo | sout - System.out.println
     * todo | Alt+ctrl+L - форматирование текста и кода в IDEA, удобная вещь.
     *
     * todo | Что такое переменная - по факту это ссылка в адрес памяти и что по этому адресу лежит
     * todo | определяется типом нашей переменной. Типы переменных бывают 2 видов - это
     * todo | примитивные и ссылочные, их всего восемь.
     * todo | Что такое метод - метод, он же в некоторых языках функция, это какое то поведение
     * todo | если класс это описание объекта, допустим машина, то метод это его поведение, то что эта
     * todo | машина может делать, например сигналить.
     * todo | Что такое String в Java? Какой это тип данных?
     * todo | String – это класс в Java, который прописан в пакете java.lang. Это не примитивный тип данных,
     * todo | как int и long. Класс String представляет строковый набор символов.
     */
}
