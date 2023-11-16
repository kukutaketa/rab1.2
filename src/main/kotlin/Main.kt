//задание 2
//Создать приложение, которое подсчитывает количество различных символов во введенной строке.
// Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
//A - 3
//D - 2
//S - 3
fun main() {
    print("Введите строку для подсчета символов:")
    val str = readLine().toString()
    val countChar= mutableMapOf<Char, Int>()
    for (char in str) {
        countChar[char] = countChar.getOrDefault(char, 0) + 1
    }
    println("Символы в алфавитном порядке:")
    countChar.toSortedMap().forEach { (char, count) -> println("$char - $count")
    }
}