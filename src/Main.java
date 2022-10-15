public class Main {
    public static void main(String[] args) {
        String word = "114411";
        String lowWord = word.toLowerCase(); // все символы переводим в нижний регистр
        char[] chars = lowWord.toCharArray(); // преобразует строку в массив символов
        int left = 0; // индекс первого символа
        int right = chars.length - 1; // индекс последнего символа
        boolean palidrome = true; // создаем переменную и изначально считаем, что строка - палидром
        while (left < right) { // пока не дошли до середины строки
            if (chars[left] != chars[right]) {
                System.out.println(word + " - не является палиндромом");// проверяем по одному символу, с каждой стороны строки, на равенство
                palidrome = false; // если проверка не пройдена, меняем значение переменной палидром на false
                break;
            }
            left++;
            right--;
        }
        if (palidrome != false) {
            System.out.println(word + " - является палиндромом");
        }
    }
}