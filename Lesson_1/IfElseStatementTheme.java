public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        int age = 17;
        float height = 1.81f;

        if(age > 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты не совершеннолетний");
        }

        if(height < 1.8) {
            System.out.println("Ты не высокий");
        } else {
            System.out.println("Ты высокий");
        }

        int firstLetterName = "Mintemir".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Тебя зовут Минтемир");
        } else if(firstLetterName == 'I') {
            System.out.println("Ты не Минтемир");
        } else {
            System.out.println("Ты без имени");
        }

        // Поиск большого числа
        int num = 8;
        int num2 = 13;
        boolean isHighestNum = num > num2;
        if(isHighestNum == true) {
            System.out.println("Число " + num2 + " больше, чем " + num);
        } else if(isHighestNum == false) {
            System.out.println("Число " + num + " меньше, чем " + num2);
        }
    }
}

