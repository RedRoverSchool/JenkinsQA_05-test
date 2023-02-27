public class StringMethods {


    /*/
    1. Написать метод removeSpaces(), который принимает на вход строку.
    Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов
    в начале и в конце строки. Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    Если пробелов не было, вернуть сообщение “Пробелов не было”.
    Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
    Test Data:
    “ Red Rover School “ → “Лишние пробелы удалены” “Red Rover School“ → “Пробелов не было”
    “” → “Строка пустая”
     */
    public String removeSpaces(String s) {

        if(!(s.isEmpty())) {
            String check = s.trim();
            if (s.length() != check.length()) {
                return "Лишние пробелы удалены";
            } else {
                return "Пробелов не было";
            }
        } else {
            return "Строка пустая";
        }
    }


    /*/
    2. Написать алгоритм removeAllAs().
     С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
      Если строка валидная, то метод удаляет все
      буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
      Test Data:
      “ Red Rover School “ → “Red Rover School“ “panda “ → “pnd”
      “taramasalata” → “trmslt”
     */

    public String removeAllAs(String text) {

        return text.isEmpty()? "Строка пустая" : text.trim().replace("a", "");
    }

    /*/
    3. Написать алгоритм removeAllZeros().
    С помощью методов из видео1, написать алгоритм,
    который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки,
    если таковые имеются. Метод возвращает обработанную строку,
    в которой нет нулей. Если в строке не было нулей,
    метод возвращает сообщение “This is a valid string”. Test Data:
    “3504209706040000 “ → “35429764“ “0000000111“ → “111
     */

    public String removeAllZeros(String text) {

        return text.isEmpty()? "This is a valid string" : text.trim().replace("0", "");
    }

    /*/
    4. Написать алгоритм removeAllSpaces.
    С помощью методов из видео1, написать алгоритм,
    который принимает на вход строку. Если строка валидная,
    то метод удаляет все пробелы из строки, если таковые имеются.
    Метод возвращает обработанную строку.
    Test Data:
    “ R e d Ro ve r Sc h ool “ → “RedRoverSchool“ “p a n d a “ → “panda”
     */

    public String removeAllSpaces(String text) {

        return text.isEmpty()? "This is a valid string" : text.replace(" ", "");
    }

    /*/
    5. Напишите метод countAs(), который принимает на вход строку и считает,
      сколько букв а или А содержится в строке. Метод возвращает количество букв a/A,
      и количество букв/знаков в слове без букв a/A. Итоговый результат должен
       строится с помощью метода из видео 2.
      Test Data:
      “Abracadabra” → “5, 6” “Homenum Revelio” → “0, 15” “3 tarAmasAlatA” → “6, 8”
     */
    public String countAs(String text) {

        int countNotA = 0;
        if (text.isEmpty()) {
            return "Строка пустая";
        } else if (text.toLowerCase().contains("a")) {
            countNotA += text.toLowerCase().replace("a","").length();
        } else {
            countNotA = text.length();
        }
        return text.length() - countNotA + ", " + countNotA;
    }

    /*/
    6. Напишите метод countJava(), который принимает на вход текст и проверяет,
     содержится ли в тексте хотя бы одно слово Java. Test Data:
     “As of March 2022, Java 18 is the latest version, while Java 17,
      11 and 8 are the current long-term support (LTS) versions.
      Oracle released the last zero-cost public update for the legacy version Java 8 LTS
      in January 2019 for
      commercial use, although it will otherwise still support Java 8 with public updates
      for personal use indefinitely. Other vendors have begun to offer zero-cost
      builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true
     “99 little bugs in a code.
      99 little bugs in a code.
      Take one down, and patch it around. 235 critical bugs in the code.” → false
     */

    public boolean countJava(String text) {

        return text.contains("Java");
    }

    /*/
    8. Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :
    после слова “писал”, и оборачивает в кавычки вторую строку
    (результат строится с помощью метода concat())
    Test Data:
    “Федор Достоевский писал”, “Надо любить жизнь больше, чем
     смысл жизни.” →
    “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
     Задание со звездочкой:
     "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
     */


    /*/
    11. Напишите метод, который принимает на вход слово, и возвращает true,
     если слово начинается и заканчивается на одинаковую букву, и false иначе
    Test Data:
    “Abracadabra” → true “Whippersnapper” → false

     */

    public boolean isSameFirstLastLetterIndexOf (String word) {
        if (word != null && !word.trim().isEmpty() && !word.trim().contains(" ")) {
            word = word.trim().toLowerCase(); //всегда сначало trim

            return word.lastIndexOf(word.charAt(0)) == (word.length()-1);

        }
        return false;
    }
}
