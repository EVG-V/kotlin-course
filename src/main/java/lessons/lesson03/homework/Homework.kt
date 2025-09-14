package lessons.lesson03.homework

//Название мероприятия
val name: String = "Хакатон "
//Дата проведения
var date: String = "10.12.2025"
//Место проведения
val place: String = "place"
//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
val budget : String  = "1000000"
//Количество участников
var members: Int = 0
// Длительность хакатона
var time: Long = 0
//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private lateinit var  contactInfo: String
//Текущее состояние хакатона (статус)
var status: String = "Не начат"
//Список спонсоров
var sponsors: String = "..."
// Бюджет мероприятия
var money: Double = 0.0;
//Текущий уровень доступа к интернету
var internetLevel: String = "Отличный"
}