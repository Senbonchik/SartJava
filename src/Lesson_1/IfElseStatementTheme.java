package Lesson_1;

public class IfElseStatementTheme {
	public static void main(String[] args) {
		System.out.println("Задание 1. Перевод псевдокода на язык Java");
		int age = 22;
		String  gender = "man";
		float myHeight = 1.80f;
		if (age > 20) {
			System.out.println("Старше двадцати");
		} else {
			System.out.println("Младше двадцати");
		}
		
		if (gender != "man") {
			System.out.println("Женщина");
		} else {
			System.out.println("Мужчина");
		}
		
		if (myHeight < 1.80) {
			System.out.println("Рост 180");
		} else {
			System.out.println("Рост больше 180");
		}
		
		String firstLetterName= "Georgiy";
		if (firstLetterName == "M") {
			System.out.println("Имя начинается на М");
		} else if (firstLetterName == "I"){
			System.out.println("Имя начинается на I");
		} else {
			System.out.println("Имя начинается на G");
		}
		
		System.out.println("\nЗадание 2. Поиск Max и Min числа");
		int max = 1211;
		int min = 12;
		if (max > min) {
			System.out.println("Вывод максимального числа " + max);
		} else if (max == min) {
			System.out.println("Числа равны");
		} else {
			System.out.println("Вывод минимального числа " + min);
		}
		
		System.out.println("\nЗадание 3. Проверка числа");
		int num = 36;
		System.out.println("Исходное число: " + num);
		if (num != 0) {
			if (num % 2 == 0) {
				System.out.println("Число четное");
			} else {
				System.out.println("Число нечетное");
			}
			if (num > 0 ) {
				System.out.println("Число положительное");
			} else {
				System.out.println("Число отрицательное");
			}
		} else {
			System.out.println("Число равное нулю");
		}
		
		System.out.println("\nЗадание 4. Поиск одинаковых цифр в числах");
		int num1 = 123;
		int num2 = 223;
		System.out.println("Исходные значния: " + "num1 = " + num1 + ", num2 = " + num2);
		int rankNum1_1 = num1 / 100;
		int rankNum1_2 = num1 / 10 % 10;
		int rankNum1_3 = num1 % 10;
		
		int rankNum2_1 = num2 / 100;
		int rankNum2_2 = num2 / 10 % 10;
		int rankNum2_3 = num2 % 10;
		boolean found = false;
		
		if (rankNum1_1 == rankNum2_1) {
			System.out.println("Одинаковые цифры в разряде сотен " + rankNum1_1);
			found = true;
		}
		if (rankNum1_2 == rankNum2_2) {
			System.out.println("Одинаковые цифры в разряде десяток " + rankNum1_2);
			found = true;
		}
		if (rankNum1_3 == rankNum2_3) {
			System.out.println("Одинковые цифры в разряде единиц " + rankNum1_3);
			found = true;
		}
		if (!found) {
			System.out.println("Нет одинаковых цифр в числах");
		}
		
		System.out.println("\nЗадание 5. Определение символа по его коду");
		char ch = '\u0057';
		System.out.println(ch);
		if (true) {
			if (ch == 'w') {
				System.out.println("Маленькая буква");
			} else if (ch == 'W') {
				System.out.println("Большая буква");
			}
		} else if (ch == 3) {
			System.out.println("Является числом");
		} else
			System.out.println("Не буква и не число");
		
		System.out.println("\nЗадание 6. Подсчет суммы вклада и начисленных банком %");
		int deposit = 300_000;
		double interestRate = 0;
		if (deposit < 100_000) {
			interestRate = 0.05;
		} else if(deposit >= 100_000 & deposit <= 300_000) {
			interestRate = 0.07;
		} else if (deposit > 300_000) {
			interestRate = 0.1;
		}
		double earnedInterest = deposit * interestRate;
		double totalAmount =  deposit + earnedInterest;
		System.out.println("Сумма вклада: " + deposit + "руб");
		System.out.println("Начисленный %: " + earnedInterest);
		System.out.println("Итоговая сумма с %: " + totalAmount + "руб");
		
		System.out.println("\nЗадание 7. Определение оценки по предметам");
		int history = 59;
		int programming = 91;
		if (history > 91 ) {
			System.out.println("Оценка по истории: 5");
		} else if (history > 73) {
			System.out.println("Оценка по истории: 4");
		} else if (history > 60) {
			System.out.println("Оценка по истории: 3");
		} else if (history <= 60) {
			System.out.println("Оценка по истории: 2");
		}
		
		if (programming > 91 ) {
			System.out.println("Оценка по программированию: 5");
		} else if (programming > 73) {
			System.out.println("Оценка по программированию: 4");
		} else if (programming > 60) {
			System.out.println("Оценка по программированию: 3");
		} else if (programming <= 60) {
			System.out.println("Оценка по программированию: 2");
		}
		int mediumPercent = (59 + 91) / 2;
		int mediumScore = (2 + 4) / 2;
		System.out.println("Средний балл по предметам: " + mediumScore);
		System.out.println("Средний процент по предметам: " + mediumPercent);
		
		System.out.println("\nЗадание 8. Расчет прибыли за год");
		int costRent = 5000;
		int costSales = 13000;
		int costProduct = 9000;
		int annualRent = costRent * 12;
		int annualSales = costSales * 12;
		int annualProduct = costProduct * 12;
		int annualProfit = annualSales - (annualRent + annualProduct);
		if (annualProfit > 0) {
			System.out.println("Прибыль за год: +" + annualProfit + "руб");
		} else if (annualProfit < 0) {
			System.out.println("Прибыль за год: " + annualProfit + "руб");
		} else {
			System.out.println("Прибыль за год: 0 руб");
		}
		System.out.println("\nЗадание 9. Подсчет количества банкнот");
		int amount = 567;
		int hundred = 10;
		int ten = 5;
		int one = 50;
		System.out.println("Выдаваемая сумма: " + amount);
		if (amount > (hundred * 100 + ten * 10 + one)) {
			System.out.println("В банкомате недостаточно средств");
		} else {
			hundred = amount / 100;
			amount -= hundred * 100;
			ten = amount / 10;
			amount -= ten * 10;
			one = amount;
			System.out.println("Номинал банкнот: 100, 10, 1");
			System.out.println("Требуемое количество банкнот: " + hundred + " сотен, " +
				"" + ten + " десяток, " + one + " единиц");
		}
	}
}
