public class VariablesTheme {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1. Вывод характеристик компьютера");
        byte core = 6;
        short typeSystem = 64;
        int ram = 16;
        float freqCpu = 4.4f;
        long price = 195000L;
        double hddForm = 3.5;
        char lable = 'a';
        boolean isNew = true;
        System.out.println("Количество ядер = " + core);
        System.out.println("Тип системы = " + typeSystem);
        System.out.println("Количество оперативной памяти = " + ram + " гб.");
        System.out.println("Частота процессора = " + freqCpu + " Ггц.");
        System.out.println("Стоимость компьютера = " + price + " руб.");
        System.out.println("Форм-фактор жесткого диска = " + hddForm);
        System.out.println("Индекс марки видеокарты = " + lable);
        System.out.println("Он новый ? - " + isNew + " \n");
        
        // Task 2
        System.out.println("Задача 2. Расчет стоимости товара со скидкой");
        double penPrice = 105.5; // Стоимость ручки
        double bookPrice = 235.83; // Стоимость книги
        double discountSum = 0.11; // Процент скидки
        double totalPrice = penPrice + bookPrice; // Полная стоимость без скидки
        double discountPrice = totalPrice * discountSum; // сумма скидки
        double totalSum = totalPrice - discountPrice; // Стоимость товара со скидкой
        System.out.println("Стоимость товаров без скидки = " + totalPrice + " руб.");
        System.out.println("Сумма скидки = " + discountPrice + " руб.");
        System.out.println("Стоимость товаров со скидкой = " + totalSum + " руб.\n");

        // Task 3
        System.out.println("Задача 3. Вывод слова JAVA");
        System.out.println("   J    a v     v  a");
        System.out.println("   J   a a v   v  a a");
        System.out.println("J  J  aaaaa V V  aaaaa");
        System.out.println(" JJ  a     a V  a     a\n");

        // Task 4
        System.out.println("Задача 4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127; // Диапазон от -128 до 127 
        int maxInt = 2147483647; // Диапазон от -2147483648 до 2147483647
        short maxShort = 32767; // Диапазон от -32768 до 32767
        long maxLong = 9223372036854775807L; //Диапазон -9223372036854775808 до 9223372036854775807
        System.out.printf("byte = %d, byte+ = %d, byte- = %d\n", maxByte, maxByte++, maxByte--);
        System.out.printf("int = %d, int+ = %d, int- = %d\n", maxInt, maxInt++, maxInt--);
        System.out.printf("short = %d, short+ = %d, short- = %d\n",
         maxShort, maxShort++, maxShort--);
        System.out.printf("long = %d, long+ = %d, long- = %d\n\n", maxLong, maxLong++, maxLong--);

        // Task 5
        System.out.println("Задача 5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("1. С помощью третьей переменной");
        System.out.println("Исходные значения переменных: a = " + a + "; " + "b = " + b + ";");
        c = a;
        a = b;
        b = c;
        System.out.println("Новые значения переменных: a = " + a + "; " + "b = " + b + ";\n");
        System.out.println("2. С помощью арифметических операций");
        System.out.println("Исходные значения переменных: a = " + a + "; " + "b = " + b + ";");
        a -= b;
        b += a;
        a = b - a;
        System.out.println("Новые значения переменных: a = " + a + "; " + "b = " + b + ";\n");
        System.out.println("3. С помощью побитовой  операции ^");
        System.out.println("Исходные значения переменных: a = " + a + "; " + "b = " + b + ";");
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.println("Новые значения переменных: a = " + a + "; " + "b = " + b + ";\n");

        // Task 6
        System.out.println("Задача 6. Вывод символов и их кодов");
        int sum1 = 36;
        int sum2 = 42;
        int sum3 = 64;
        int sum4 = 124;
        int sum5 = 126;
        char dollar = '$'; // 36
        char asterisk = '*'; // 42
        char dog = '@'; // 64
        char vertBar = '\\'; // 124
        char tilde = '~'; // 126
        System.out.printf("Код\tСимвол\n%d\t%c\n", sum1, dollar);
        System.out.printf("%d\t%c\n", sum2, asterisk);
        System.out.printf("%d\t%c\n", sum3, dog);
        System.out.printf("%d\t%c\n", sum4, vertBar);
        System.out.printf("%d\t%c\n\n", sum5, tilde);

        // Task 7
        System.out.println("Задача 7. Вывод в консоль ASCII-арт Дюка");
        char backSlash =  '\\';
        char leftPar = '(';
        char rightPar = ')';
        char underScore = '_';
        char slash = '/';
        System.out.printf("     %c%c     \n", slash, backSlash);
        System.out.printf("    %c  %c   \n", slash, backSlash);
        System.out.printf("   %c%c%c %c%c  \n", slash, underScore, leftPar, rightPar, backSlash );
        System.out.printf("  %c      %c   \n", slash, backSlash);
        System.out.printf(" %c%c%c%c%c%c%c%c%c%c\n\n", slash, underScore, underScore,
         underScore, underScore, slash, backSlash, underScore, underScore, backSlash); 

        // Task 8
        System.out.println("Задача 8. Манипуляции с сотнями, десятками и единицами числа");
        int sum = 123;
        int hundreds = sum / 100;
        int tens = sum / 10 % 10;
        int units = sum % 10;
        int sumRanks = hundreds + tens + units;
        int sumProduct= hundreds * tens * units;
        System.out.println("Число " + sum + " содержит:"); 
        System.out.printf("\tсотен - %d\n", hundreds); 
        System.out.printf("\tдесятков - %d\n", tens);
        System.out.printf("\tединиц - %d\n", units);
        System.out.printf("Сумма разрядов = %d\n", sumRanks);
        System.out.printf("Произведение разрядов = %d\n\n", sumProduct);

        //Task 9
        System.out.println("Задача 9. Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);

    }
}