package org.example.kotlin2025.lesson5

class lesson5Task {
    /*ЗАДАЧА 1:
    Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение
     начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
    Задача: Рассчитать предполагаемую интенсивность звука после затухания.
     Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
     Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.*/

     fun soundIntensity(startSoundIntensity: Double, StartCoefficient: Double?) {
        val finalCoefficient = StartCoefficient ?: 0.5
        val soundIntensity: Double = startSoundIntensity * finalCoefficient
        println(soundIntensity)
    }


    /* ЗАДАЧА 2:
    Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости.
    В случае, если стоимость не указана, то берётся стандартная стоимость в $50
    Задача: Рассчитать полную стоимость доставки.
    */
    fun fullDeliveryCost(deliveryCost: Double, productCost: Double?) {
        val insuranceCost =  productCost ?: 50.00
        val fullDeliveryCost: Double = deliveryCost + insuranceCost * 0.0005
        println(fullDeliveryCost)
    }

 /*   ЗАДАЧА 3:
    Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано.
    Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
    Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.*/

    fun meteorologicalMeasurements (indicator1: String, indicator2: String, atmosphericPressure: String?) {
        val atmosphericPressureChecker: String = atmosphericPressure ?: "Не удалось получить данные об атмосферном давлении"
        println(atmosphericPressureChecker)
    }
}

fun main() {
    val lesson5Task = lesson5Task()
    val task = lesson5Task()
    task.soundIntensity(5.0, null)
    task.fullDeliveryCost(50.99, null)
    task.meteorologicalMeasurements("500", "2", null)}