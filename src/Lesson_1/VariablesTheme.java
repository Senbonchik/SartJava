package Lesson_1;

public class VariablesTheme {
    public static void main(String[] args){

        System.out.println("Задание 1. Вывод значений переменных на консоль.");
        byte numberCores = 6;
        System.out.println("Количество ядер: " + numberCores);
        short ram = 16;
        System.out.println("Оперативная память: " + ram + "ГБ");
        int processorGeneration = 11400;
        char model = 'f';
        System.out.println("Процессор Intel Core i5-" + processorGeneration + model);
        float processorFrequencyGigahertz = 2.60f;
        System.out.println("Частота процессора: " + processorFrequencyGigahertz);
        long solidStateDrive = 465;
        System.out.println("Накопитель: " + solidStateDrive + "ГБ");
        double videoCard = 2060;
        System.out.println("Видеокарта RTX: " + videoCard);
        boolean goodPC = true;
        System.out.println(goodPC);

        System.out.println("\nЗадание 2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrise = 200;
        float discount = 0.11f;
        int sumWithoutDiscount = penPrice + bookPrise;
        float sumDiscount = sumWithoutDiscount * discount;
        float discountPrice = sumWithoutDiscount - sumDiscount;

        System.out.println("Общая стоимость товаров без скидки - " + sumWithoutDiscount + "\nСумма скидки - " +
                sumDiscount + "\nОбщая стоимость товаров со скидкой - " + discountPrice);

        System.out.println("\nЗадание 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    \n   J   a a  v   v  a a   \nJ  J  aaaaa  V V  aaaaa   \n" +
                " JJ  a     a  V  a     a");

        System.out.println("\nЗадание 4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        byte minByte = maxByte;
        System.out.println("Значения для byte");
        System.out.println("Первоначальное значение: " + maxByte);
        minByte++;
        System.out.println("Значение после инкремента: " + minByte);
        maxByte--;
        System.out.println("Значение после декремента: " + maxByte);

        short maxShort = 32767;
        short minShort = maxShort;
        System.out.println("\nЗначения для short");
        System.out.println("Первоначальное значение: " + maxShort);
        minShort++;
        System.out.println("Значение после инкремента: " + minShort);
        maxShort--;
        System.out.println("Значение после декремента: " + maxShort);

        System.out.println("\nЗначения для int");
        int maxInt = (int) Math.pow(2,31);
        int minInt = maxInt;
        System.out.println("Первоначальное значение: " + maxInt);
        minInt++;
        System.out.println("Значение после инкремента: " + minInt);
        maxInt--;
        System.out.println("Значение после декремента: " + maxInt);

        System.out.println("\nЗначения для long");
        long maxLong = (long) Math.pow(2,63);
        long minLong = maxLong;
        System.out.println("Первоначальное значение: " + maxLong);
        minLong++;
        System.out.println("Значение после инкремента: " + minLong);
        maxLong--;
        System.out.println("Значение после декремента: " + maxLong);

        System.out.println("\nЗадание 5. Перестановка значений переменных");
        int originalNum1 = 2;
        int originalNum2 = 5;
        int num1 = originalNum1;
        int num2 = originalNum2;
        int num3;
        num3 = num1;//2
        num1 = num2;//5
        num2 = num3;//2
        System.out.println("1) С помощью третьей переменной:\n" + "Исходные значения переменных:\n" +
                "originalNum1 = " + originalNum1 + "\noriginalNum2 = " + originalNum2 +
                "\nНовые значения переменных:\n" + "" + "num1 = " + num1 + "\nnum2 = " + num2);


        System.out.println("2) С помощью арифметических операций:\n" + "Исходные значения переменных:\n" +
                "originalNum1 = " + originalNum1 + "\noriginalNum2 = " + originalNum2 +
                "\nНовые значения переменных:\n" + "" + "num1 = " + num1 + "\nnum2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("3) С помощью побитовой операции:\n" + "Исходные значения переменных:\n" +
                "originalNum1 = " + originalNum1 + "\noriginalNum2 = " + originalNum2 +
                "\nНовые значения переменных:\n" + "" + "num1 = " + num1 + "\nnum2 = " + num2);


        System.out.println("\nЗадание 6. Вывод символов и их кодов");
        char thirtyFifthCharacter = '#';
        char thirtyEighthCharacter = '&';
        char sixtyFourthCharacter = '@';
        char ninetyFourthCharacter = '^';
        char ninetyFifthCharacter = '_';
        System.out.println("Тридцать пятый символ - " + thirtyFifthCharacter + "\nТридцать восьмой символ - " +
                thirtyEighthCharacter + "\nШестьдесят четвертый символ - " + sixtyFourthCharacter +
                "\nДевяносто четвертый символ - " + ninetyFourthCharacter + "\nДевяносто пятый символ - " +
                ninetyFifthCharacter);

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
        int x,y,z;
        x = n / 100;
        y = n / 10 % 10;
        z = n % 10;
        int sum = x + y + z;
        int productOfNumbers = x * y * z;
        System.out.println("Число N содержит:\nX сотен - " + x + "\nY десятков - " + y + "\nZ единиц - " + z +
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
