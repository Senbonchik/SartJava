package Lesson_1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Задание 1. Вывод значений переменных на консоль.");
        byte numberCores = 6;
        System.out.println("Количество ядер: " + numberCores);
        short ram = 16;
        System.out.println("Оперативная память: " + ram + "ГБ");
        int processorGeneration = 11400;
        char model = 'f';
        System.out.println("Процессор Intel Core i5-" + processorGeneration + model);
        float freqCpu = 2.60f;
        System.out.println("Частота процессора: " + freqCpu + "ghz");
        long solidStateDrive = 465;
        System.out.println("Накопитель: " + solidStateDrive + "ГБ");
        double videoCard = 2060;
        System.out.println("Видеокарта RTX: " + videoCard);
        boolean goodPc = true;
        System.out.println(goodPc);

        System.out.println("\nЗадание 2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrise = 200;
        float discount = 0.11f;
        int sumWithoutDiscount = penPrice + bookPrise;
        float discountSum = sumWithoutDiscount * discount;
        float discountPrice = sumWithoutDiscount - discountSum;

        System.out.println("Общая стоимость товаров без скидки - " + sumWithoutDiscount + "\nСумма скидки - " +
                discountSum + "\nОбщая стоимость товаров со скидкой - " + discountPrice);

        System.out.println("\nЗадание 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   \nJ  J  aaaaa  V V  aaaaa   \n" +
                " JJ  a     a  V  a     a");

        System.out.println("\nЗадание 4. Вывод min и max значений целых числовых типов");
        byte originalValueByte = 127;
        byte incrementByte = originalValueByte;
        byte decrementByte = originalValueByte;
        System.out.println("Значения для byte");
        System.out.println("Первоначальное значение: " + originalValueByte);
        incrementByte++;
        System.out.println("Значение после инкремента: " + incrementByte);
        decrementByte--;
        System.out.println("Значение после декремента: " + decrementByte);

        short originalValueShort = 32767;
        short incrementShort = originalValueShort;
        short decrementShort = originalValueShort;
        System.out.println("\nЗначения для short");
        System.out.println("Первоначальное значение: " + originalValueShort);
        incrementShort++;
        System.out.println("Значение после инкремента: " + incrementShort);
        decrementShort--;
        System.out.println("Значение после декремента: " + decrementShort);

        System.out.println("\nЗначения для int");
        int originalValueInt = 2147483647;
        int incrementInt = originalValueInt;
        int decrementInt = originalValueInt;
        System.out.println("Первоначальное значение: " + originalValueInt);
        incrementInt++;
        System.out.println("Значение после инкремента: " + incrementInt);
        decrementInt--;
        System.out.println("Значение после декремента: " + decrementInt);

        System.out.println("\nЗначения для long");
        long originalValueLong = 9_223_372_036_854_775_807L;
        long incrementLong = originalValueLong;
        long decrementLong = originalValueLong;
        System.out.println("Первоначальное значение: " + originalValueLong);
        incrementLong++;
        System.out.println("Значение после инкремента: " + incrementLong);
        decrementLong--;
        System.out.println("Значение после декремента: " + decrementLong);

        System.out.println("\nЗадание 5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3;
        num3 = num1;//2
        num1 = num2;//5
        num2 = num3;//2
        System.out.println("1) С помощью третьей переменной:\n" + "Исходные значения переменных:\n" +
                "num1 = 2" + "\nnum2 = 5" + "\nНовые значения переменных:\n"
                + "" + "num1 = " + num1 + "\nnum2 = " + num2);
        num1 = num1 + num2;//7
        num2 = num1 - num2;//5
        num1 = num1 - num2;//2

        System.out.println("2) С помощью арифметических операций:\n" + "Исходные значения переменных:\n" +
                "num1 = 5" +   "\nnum2 = 2" + "\nНовые значения переменных:\n"
                + "" + "num1 = " + num1 + "\nnum2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("3) С помощью побитовой операции:\n" + "Исходные значения переменных:\n" +
                "num1 = 2" +   "\nnum2 = 5"  + "\nНовые значения переменных:\n"
                + "" + "num1 = " + num1 + "\nnum2 = " + num2);


        System.out.println("\nЗадание 6. Вывод символов и их кодов");
        char symbolHash = '#';
        char symbolAnd = '&';
        char symbolAtSign = '@';
        char symbolCircumeFlex = '^';
        char symbolUnderScore = '_';
        System.out.println("Тридцать пятый символ - " + symbolHash + "\nТридцать восьмой символ - " +
                symbolAnd + "\nШестьдесят четвертый символ - " + symbolAtSign +
                "\nДевяносто четвертый символ - " + symbolCircumeFlex + "\nДевяносто пятый символ - " +
                symbolUnderScore);

        System.out.println("\nЗадание 7. Вывод на консоль ACII-арт Дюка");
        char underscore = '_';
        char rightBracket = ')';
        char leftBracket = '(';
        char slash = '/';
        char backSlash = '\\';
        System.out.println("\n     "  + slash + backSlash + "\n    " + slash + "  " + backSlash
                + "\n   " + slash + underscore + leftBracket + " "+ rightBracket + backSlash
                + "\n  " + slash + "      " + backSlash + "\n " + slash + underscore + underscore
                + underscore + underscore + slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\nЗадание 8. Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int hundreds, tens, units;
        hundreds = n / 100;
        tens = n / 10 % 10;
        units = n % 10;
        int sum = hundreds + tens + units;
        int productOfNumbers = hundreds * tens * units;
        System.out.println("Число N содержит:\nX сотен - " + hundreds + "\nY десятков - " + tens + "\nZ единиц - " + units +
                "\nСумма чисел - " + sum + "\nПроизведение чисел - " + productOfNumbers);

        System.out.println("\nЗадание 9. Вывод времени");
        int seconds = 86399;
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
