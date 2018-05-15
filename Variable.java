package ru.foxit.grayfox;

/**
 * Author Variable.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

public class Variable {

    // todo | Уровень доступа у переменных это static
    // todo | Уровень доступа у методов public private protected и без уровня доступа.

    // Что такое байт - это переменная в которой лежит значение, переменная ссылающая на область
    // памяти, в которой лежит значение равной одному байту.
    // Размер байта - всего 8 бит в памяти.
    //// Байты и шорты по тихому компилятором приводятся к Intу! Так что смысл писать byte, а тем-более
    //// short, который нигде не используется вообще, нет смысла!
    static byte aByte = 127; // -128 до 127 диапазон

    // Занимает всего 16 бит в памяти.
    static short aShort = 1000; // -32768 до 32767

    // Ходовая переменная или целочисленная, это int (Integer)
    static int anInt = 32200; // -2147483648 до 2147483647, 32 бита в памяти.

    static long aLong = 640000; // -9223372036854775808 до 9223372036854775807, 64 бита в памяти.

    // float у нас с плавающей точкой, то тут не целый числа, а точнее дробные. А для того, чтобы
    // значение было float, нужно в конце ставить букву F. Принято ставить большую букву F, чтобы
    // было понятно, что это действительно флоат.
    // С точкой 50точка0 пишем не для компилятора, а для того, кто наш код будет читать.
    static float aFloat = 50.0F; // 32 бита занимает в памяти.

    // Даубл гораздо точнее, чем флоат и если Вам нужна высокая точность для расчетов типа денежных или
    // каких-то лабораторных, то лучше используйте Даубл, но если Вам принципиально не нужна точность, то
    // можно использовать Float.
    static double aDouble = 3.14; // 64 бита в памяти.

    static boolean aBoolean = true; // Применяется в логических конструкциях. 4-8 байтов в памяти, зависит
    // от виртуальной java машины.

    static char aChar = '2';

    public static void main(String[] args) {
        aByte(); // Выводим байт
        aShort(); // Выводим шорт
        aInt(); // Выводим инт
        aLong(); // Выводим лонг
        aFloat(); // Выводим флоат
        aDouble(); // Выводим даубл
        aBoolean(); // Выводим болеан
        aChar(); // Выводим чар

        // Приведение типов
        byte bByte = 127; // Создали байт и присвоили 127
        int aInt = 10; // Создали инт и присвоили 10
        bByte = (byte) aInt; // Байт b присвоили не просто к "int a", а преобразовали его в байт и присвоили.
        System.out.println("Приведение типов: b = " + bByte);
    }

    public static void aByte() {
        System.out.println("=====================aByte=" + aByte + "=============================");
        System.out.println("Минимальное значение Byte: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение Byte: " + Byte.MAX_VALUE);
        System.out.println("===========================================================");
    }

    public static void aShort() {
        System.out.println("=====================aShort=" + aShort + "===========================");
        System.out.println("Минимальное значение Short: " + Short.MIN_VALUE);
        System.out.println("Максимальное значение Short: " + Short.MAX_VALUE);
        System.out.println("===========================================================");
    }

    public static void aInt() {
        System.out.println("=====================anInt=" + anInt + "===========================");
        System.out.println("Минимальное значение Integer: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение Integer: " + Integer.MAX_VALUE);
        System.out.println("===========================================================");
    }

    public static void aLong() {
        System.out.println("=====================aLong=" + aLong + "==========================");
        System.out.println("Минимальное значение Long: " + Long.MIN_VALUE);
        System.out.println("Максимальное значение Long: " + Long.MAX_VALUE);
        System.out.println("===========================================================");
    }

    public static void aFloat() {
        System.out.println("=====================aFloat=" + aFloat + "===========================");
        System.out.println("Минимальное значение Float: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение Float: " + Float.MAX_VALUE);
        //System.out.println("Минимальное значение Float: " + (int)Float.MIN_VALUE);
        //System.out.println("Максимальное значение Float: " + (int)Float.MAX_VALUE);
        System.out.println("===========================================================");
    }

    public static void aDouble() {
        System.out.println("=====================aDouble=" + aDouble + "==========================");
        System.out.println("Минимальное значение Double: " + Double.MIN_VALUE);
        System.out.println("Максимальное значение Double: " + Double.MAX_VALUE);
        System.out.println("===========================================================");
    }

    public static void aBoolean() {
        System.out.println("=====================aBoolean=" + aBoolean + "=========================");
        System.out.println("Минимальное значение Boolean: " + Boolean.TRUE);
        System.out.println("Максимальное значение Boolean: " + Boolean.FALSE);
        System.out.println("===========================================================");
    }

    public static void aChar() {
        System.out.println("=====================aChar=" + aChar + "===============================");
        System.out.println("Минимальное значение Character: " + (int)Character.MIN_VALUE);
        System.out.println("Максимальное значение Character: " + (int)Character.MAX_VALUE);
        System.out.println("===========================================================");
    }


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
