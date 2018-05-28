package ru.foxit.grayfox;

/**
 * Author Main.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

/**
 * Комментарий называемый Java DOC
 * Блочный
 * комментарий java doc
 * Применяется для описании работы класса, например этот класс описывает программу Hello World.
 */


     /*
     Блочный
     комментарий, обычно очень редко встречается.
     */

// Однострочный комментарий для примечаний, заметок.

// todo | Синий комментарий с крюком на код.

// Без чего жить нельзя: Plugins - Browse repositories - Key Promouter - скачиваем первый где больше скачиваний.
// Presentation Assistant - Плагин для тех, кто делает видеоуроки по джаве на идеи.
// Если не видны цифры строчек, правой клавишей мыши по панели - Show Line Numbers.
// Все что закрывается ";" является операторами, все что не закрываются точной с запятой, не является оператором.

// Поговорим пока что про примитивный тип данных.
// В джаве есть примитивные и ссылочные типы данных. Существует 8 примитивных типов данных!
// Переменные представляют собой зарезервированную область памяти
// для хранения данных, при этом, в зависимости от типа переменной, операционная система выделяет память и решает,
// что именно должно в ней храниться. Примитивными могут быть - byte, short, int, long, float, double, boolean, char.
public class Main {
    public static void nameNum() {

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

        // todo | Мне нужно понять при повторении урока - что такое статик, для чего оно нужно я понимаю.
        // Для того, чтобы переменная не смогла менять своего значения в программе, необходимо определить ее как
        // константу с помощью ключевого слова final. final выставляется перед типом данных. Пример ниже:
        // final [тип_данных] [идентификатор(имя_переменной)] = [начальное_значение];
        // А еще мы можем динамически изменять переменную в методе, как ты уже понял, есть
        // динамическая​​ инициализация ​​переменных. Пример указывать не нужно! Это самое прям легкое!
        // То что подсвечивается обычным шрифтом, это используемые переменные, то что подсвечивает серым - не используемые
        // переменные.
        final int num = 0, numTwo = 0;
        int numberOne, numberTwo, NumberFree;
        numberOne = numberTwo = NumberFree = 0;

        // Условный оператор if позволяет выборочно выполнять отдельные части программы. Ниже приведена
        // простейшая форма оператора if. По простому, - if это условие, является как одним из инструментом для управления
        // переменных или ссылочных переменных или сравнивания чего то.
        if (num == numTwo) {
            nameMap();
        } else {
            System.out.println("Не выполнено..." + " код ошибки " + numberOne);
        }
    }

    public static String nameMap() {
        String name = "Привет, мир";
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        testTwo();
        number(1, 2);
        nameMap();
        nameNum();
        test("Java", 2);
    }

    /* todo Как выглядит метод
    тип_метода имя_метода (список_параметров) {
    тело_метода;
    }
    todo Это без уровня доступа, статик/не статик, чисто например - void имя(список_параметров)
    */

    // мы создали метод тест, в списке параметров укажем с чем мы будем работать - мы будем работать с текстом и
    // цифрами, в поведение программы выведем в консоль текст, цифра, а в Main укажем метод (в котором у нас происходит
    // поведение, а в скобках укажем текст нам нужный и цифра. Тем самым мы получим нужным нам результат.
    public static void test(String text, int number) {
        System.out.println(text + ", " + number);
    }

    public static void testTwo() {
        System.out.println("Hello");
    }

    public static void number(int numA, int numB) {
        int numC = numA + numB;
        System.out.println("number " + numA + " + " + numB + " = " + numC);
    }
}
