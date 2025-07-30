package org.example.kotlin2025.lesson6

class lesson6Task {

    /* Задание 1: "Определение Сезона"
    Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
*/
    fun getSeason(numberOfMonth: Int): String {
       return when {
            numberOfMonth < 1 || numberOfMonth > 12 -> "Ввведен неверный номер месяца"
            numberOfMonth in 1..2 || numberOfMonth == 12 -> "Cезон: Зима"
            numberOfMonth in 3..5 -> "Cезон: Весна"
            numberOfMonth in 6..8 -> "Cезон: Лето"
            else -> "Cезон: Осень"
        }
    }

    /*   Задание 2: "Расчет Возраста Питомца"
    Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
    До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
*/

    fun getHumanAge(dogAge: Int): Double {
        require(dogAge > -1) { "Возраст собаки не может быть отрицательным" }
        return when {
            dogAge <= 2 -> dogAge * 10.5
            else -> 21.0 + (dogAge - 2) * 4.0
        }
    }


    /*Задание 3: "Определение Вида Транспорта"
    Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
     Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
     */

    fun choiceKindOfTransport(distance: Int): String {
        require(distance >= 0) { "Расстояние должно быть больше 0" }
        return if (distance <= 1) {
            "Рекомендуется преодолеть расстояние пешком"
        } else if (distance in 2..5) {
            "Рекомендуется преодолеть расстояние на велосипеде"
        } else {
            "Рекомендуется преодолеть расстояние на машине"
        }
    }

    /*Задание 4: "Расчет Бонусных Баллов"
    Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
    Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей
     при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
*/
    fun getBonus(summ: Int): Int {
        require(summ >= 0) { "Cумма должна быть больше 0" }
        return when {
            summ < 1001 -> summ / 100 * 2
            else -> (summ - 1000) / 100 * 5 + 1000 / 100 * 2
        }
    }

    /*
        Задание 5: "Определение Типа Документа"
        Контекст: В системе хранения документов каждый файл имеет расширение.
        Напишите функцию, которая на основе расширения файла
        возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
    */

    fun getDocumentType(nameFile: String): String {
        return if (nameFile == "png" || nameFile == "jpeg") {
            "Изображение"
        } else if (nameFile == "doc" || nameFile == "docx" || nameFile == "txt") {
            "Текстовый документ"
        } else if (nameFile == "xls" || nameFile == "xlsx") {
            "Таблица"
        } else {
            "Неизвестный тип"
        }
    }

   /* Задание 7: "Подбор Одежды по Погоде"
    Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка"
    при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты"
    при температуре выше 15. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.*/

    fun getRecommendationsOnClothingType(temperature: Int): Any {
        return if (temperature <= -30 || temperature >= 35) {
            "Не выходите из дома"
        } else if (temperature in -29..-1) {
            "Тип одежды: куртка и шапка"
        } else if (temperature in 0..15) {
            "Тип одежды: ветровка"
        }
        else {"Тип одежды: Футболка и шорты"
        }
    }

    /*    Задание 8: "Выбор Фильма по Возрасту"
    Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
    Напишите функцию, которая принимает возраст зрителя и возвращает
    доступные для него категории фильмов: "детские", "подростковые", "18+".*/
 fun getFilm(age: Int): String {
    require(age > -1) { "Возраст зрителя не может быть отрицательным" }
    return when  {
        age in 0..11 -> "Доступная категория: детские"
        age in 12..17 ->"Доступные категории: детские и подростковые фильмы"
        else -> {"Доступные категории: детские, подростковые, 18+ фильмы"}
    }

 }
}


fun main() {
    val lesson6Task = lesson6Task()
    println(lesson6Task.getSeason(6))
    println(lesson6Task.getSeason(13))

    println(lesson6Task.getHumanAge(3))
    println(lesson6Task.getHumanAge(0))

    println(lesson6Task.choiceKindOfTransport(100))
    println(lesson6Task.choiceKindOfTransport(0))
    println(lesson6Task.choiceKindOfTransport(1))
    println(lesson6Task.choiceKindOfTransport(3))

    println(lesson6Task.getBonus(1000))
    println(lesson6Task.getBonus(1200))
    println(lesson6Task.getBonus(1199))
    println(lesson6Task.getBonus(99))
    println(lesson6Task.getBonus(0))

    println(lesson6Task.getDocumentType("png"))
    println(lesson6Task.getDocumentType("PDF"))

    println(lesson6Task.getRecommendationsOnClothingType(-50))
    println(lesson6Task.getRecommendationsOnClothingType(-29))
    println(lesson6Task.getRecommendationsOnClothingType(0))
    println(lesson6Task.getRecommendationsOnClothingType(15))
    println(lesson6Task.getRecommendationsOnClothingType(22))
    println(lesson6Task.getRecommendationsOnClothingType(35))

    println(lesson6Task.getFilm(0))
    println(lesson6Task.getFilm(11))
    println(lesson6Task.getFilm(12))
    println(lesson6Task.getFilm(17))
    println(lesson6Task.getFilm(18))
}
