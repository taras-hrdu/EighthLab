# EighthLab
My ninth  Lab and third on Java
My third lab in Java 
If you want to launch the program, follow instruction:
Clone/Download lab9 branch

Go into repo folder
Run javac app.java to compile the source
Run java App to start the app

Завдання:
Задачею 9 лабораторної є створити REST сервіс для одного з класів, створених у лабораторній роботі 3 (наприклад для класу Aligator з прикладу в лабораторній роботі 8  - AligatorController),  в котрому реалізовані CRUD-операції (Get/Post/Put/Delete) над ресурсом (наприклад над ресурсом Aligator) та операція повернення всіх об'єктів. 
Операція get має використовувати id в url-запиту: /aligator/20
Операція get без id в url-запиту має повертати список всіх наявних об'єктів 
Для реалізації  REST сервісу базовий клас з 8-ї лабораторної слід розширити полем id (типу Integer), та добавити set/get методи
Також код слід перевірити з-за допомогою Findbugs/checkstyle/pmd плагінів
Код слід залити окремим пул реквестом відносно коду 8-ї лабораторної (тобто необхідно створити окремий бренч в тому самому репозиторії, де є код 8ї роботи, який згодом стане пул реквестом, але сам пул реквест не мерджати!!!!)
Код контролера та класу RestApplication слід помістити в окремих пакетах
Збереження об'єктів класу Алігатор слід виконувати в об'єкті типу  Map
Дана лабораторна передбачає зміну існуючого pom.xml файлу шляхом додавання в `нього необхідних залежностей



