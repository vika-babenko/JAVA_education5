public class Lab3 {
    public static void main(String[] args) {
        //задаємо тип string і текст для роботи програми
        String s = "Hello, world! How are you? This is my program. This is my 3-d lab!";
        if (s.length() == 0) {
            System.out.print("Відсутній текст. Введіть текст будь ласка!");
        }
        //виводимо за допомогою регулярного виразу зміну тексту
        System.out.println(s.replaceAll("([^.!?, ]+)([^.!?]+?)([^.!?, ]+)([.!?])", "$3$2$1$4"));


    }
}
