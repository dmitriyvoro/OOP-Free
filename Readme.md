Задача 1 - Iterator
    � Создать класс Студент
    � Создать класс УчебнаяГруппа
    � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
    интерфейс Iterator
    � Реализовать его контракты (включая удаление)

Задача 2 - Iterable
    � Модифицировать класс УчебнаяГруппа, заставив его реализовать
    интерфейс Iterable
    � Реализовать метод iterator() возвращающий экземпляр созданного нами
    итератора
    � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
    студента по ФИО
    � Создать класс Контроллер, добавив в него метод удаления студента и
    вызывать в нем созданный метод из УчебнаяГруппаСервис

Задача 3 - Comparable
    � Модифицировать класс Студент, заставив его реализовать интерфейс
    Comparable
    � Реализовать контракт compareTo () со сравнением по какому-либо
    параметру (пример studentId)
    � Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
    сортировки списка студентов по id
    � Модифицировать класс Контроллер, добавив в него метод сортировки
    списка студентов по id и вызывать в нем созданный метод из
    УчебнаяГруппаСервис

Задача 4 - Comparator
    � Создать класс СтудентКомпаратор реализующий интерфейс Comparator
    � Реализовать контракт compare () со сравнением по какому-либо параметру
    (пример: сочетание Имя+Фамилия)
    � Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
    сортировки списка студентов по ФИО
    � Модифицировать класс Контроллер, добавив в него метод сортировки
    списка студентов по ФИО и вызывать в нем созданный метод из
    УчебнаяГруппаСервис


