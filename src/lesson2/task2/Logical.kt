@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {
    return if ((number/1000+number/100%10) == (number/10%10+number%10) ) true else false
}

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    return if ((x1 == x2) || (y1 == y2) || (x1 == y2) && (x2 == y1) ) true else false
}


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int {
    return when{
        year > 0 && year % 4 != 0 && month == 1 -> 31
        year > 0 && year % 4 != 0 && month == 3 -> 31
        year > 0 && year % 4 != 0 && month == 5 -> 31
        year > 0 && year % 4 != 0 && month == 7 -> 31
        year > 0 && year % 4 != 0 && month == 8 -> 31
        year > 0 && year % 4 != 0 && month == 10 -> 31
        year > 0 && year % 4 != 0 && month == 12 -> 31
        year > 0 && year % 4 != 0 && month == 4 -> 30
        year > 0 && year % 4 != 0 && month == 6 -> 30
        year > 0 && year % 4 != 0 && month == 9 -> 30
        year > 0 && year % 4 != 0 && month == 11 -> 30
        year > 0 && year % 4 != 0 && month == 2 -> 28
        else -> 29
    }
}

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double
): Boolean {
    return if (sqrt(sqr(x1 - x2) + sqr(y1 - y2)) + r1 <= r2 ) true else false
}

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    return if ((a<=r) && (b<=s) ||(a<=r) && (c<=s) || (b<=r) && (a<=s) || (b<=r) && (c<=s) || (c<=r) && (a<=s) || (c<=r) && (b<=s)) true else false
}
