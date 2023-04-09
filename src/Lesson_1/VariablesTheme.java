package Lesson_1;

public class VariablesTheme {
	public static void main(String[] args) {
        System.out.println("Задание 1. Вывод значений переменных на консоль.");
		byte numberCores = 6;
		System.out.println("Количество ядер: " + numberCores);
		short ram = 16;
		System.out.println("Оперативная память: " + ram + "ГБ");
		int cpuGeneration = 11400;
		char model = 'f';
		System.out.println("Процессор Intel Core i5-" + cpuGeneration + model);
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
		byte byteMax = 127;
		System.out.println("Значения для byte");
		System.out.println("Первоначальное значение: " + byteMax);
		byteMax++;
		System.out.println("Значение после инкремента: " + byteMax);
		byteMax--;
		System.out.println("Значение после декремента: " + byteMax);
		
		short shortMax = 32767;
		System.out.println("\nЗначения для short");
		System.out.println("Первоначальное значение: " + shortMax);
		shortMax++;
		System.out.println("Значение после инкремента: " + shortMax);
		shortMax--;
		System.out.println("Значение после декремента: " + shortMax);
		
		System.out.println("\nЗначения для int");
		int intMax = 2147483647;
		System.out.println("Первоначальное значение: " + intMax);
		intMax++;
		System.out.println("Значение после инкремента: " + intMax);
		intMax--;
		System.out.println("Значение после декремента: " + intMax);
		
		System.out.println("\nЗначения для long");
		long longMax = 9_223_372_036_854_775_807L;
		System.out.println("Первоначальное значение: " + longMax);
		longMax++;
		System.out.println("Значение после инкремента: " + longMax);
		longMax--;
		System.out.println("Значение после декремента: " + longMax);
		
		System.out.println("\nЗадание 5. Перестановка значений переменных");
		System.out.println("1) С помощью третьей переменной:\n");
		int num1 = 2;
		int num2 = 5;
		int num3 = num1;
		num1 = num2; //5
		num2 = num3; //2
		System.out.println("Исходные значения переменных:\n" + "num1 = 2" + "\nnum2 = 5"
			+ "\nНовые значения переменных:\n" + "" + "num1 = " + num1 + "\nnum2 = " + num2);
		
		System.out.println("2) С помощью арифметических операций:\n");
		num1 += num2; //7
		num2  = num1 - num2; //5
		num1 -= num2; //2
		System.out.println("Исходные значения переменных:\n" + "num1 = 5" +   "\nnum2 = 2" +
			"\nНовые значения переменных:\n" + "" + "num1 = " + num1 + "\nnum2 = " + num2);
		
		System.out.println("3) С помощью побитовой операции:\n");
		num1 ^= num2;
		num2 = num1 ^ num2;
		num1 ^= num2;
		System.out.println("Исходные значения переменных:\n" + "num1 = 2" +   "\nnum2 = 5" +
			"\nНовые значения переменных:\n" + "" + "num1 = " + num1 + "\nnum2 = " + num2);
		System.out.println("\nЗадание 6. Вывод символов и их кодов");
		char hash = '#';
		char and = '&';
		char atSign = '@';
		char circumeFlex = '^';
		char underScore = '_';
		System.out.println("Тридцать пятый символ - " + hash + "\nТридцать восьмой символ - " +
				and + "\nШестьдесят четвертый символ - " + atSign +
				"\nДевяносто четвертый символ - " + circumeFlex + "\nДевяносто пятый символ - " +
				underScore);
		
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
		int originalNumber = 123;
		int hundreds, tens, units;
		int sumDigits, prodDigits;
		hundreds = originalNumber / 100;
		tens = originalNumber / 10 % 10;
		units = originalNumber % 10;
		sumDigits = hundreds + tens + units;
		prodDigits = hundreds * tens * units;
		System.out.println("Число N содержит:\nX сотен - " + hundreds + "\nY десятков - " + tens + "\nZ единиц - " + units +
				"\nСумма чисел - " + sumDigits + "\nПроизведение чисел - " + prodDigits);
		
		System.out.println("\nЗадание 9. Вывод времени");
		int seconds = 86399;
		int hours = seconds / 3600;
		int minutes = seconds / 60 % 60;
		seconds %= 60;
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
	}
}
