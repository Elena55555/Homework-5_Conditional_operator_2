## Домашняя работа 
# Задача 1
У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона, ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.

Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:

Для iOS — «Установите версию приложения для iOS по ссылке».
Для Android — «Установите версию приложения для Android по ссылке».
Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).


Критерии оценки
 Программа написана корректно и выдает правильный результат.
 Соблюдаются все условия задания.
 Соблюдаются правила названия переменных и пунктуация.
 Корректно инициализированы переменные.

# Задача 2
Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.

Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.

Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:

Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
Для Android: «Установите облегченную версию приложения для Android по ссылке».
Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.

Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.

Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).


 Критерии оценки
 Программа выполняет все условия задачи.
 Написали код без вложенностей.
 Соблюдаются правила названия переменных и пунктуация.
 В зависимости от условий задачи в консоль выводится корректная фраза.

# Задача 3
Напишите программу, которая определяет, является ли год високосным или нет.

Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.

Программа должна определять, високосный год или нет, и выводить соответствующее сообщение: « …. год является високосным» или «... год не является високосным».

Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год. Год должен быть больше, чем 1584 (в котором был введен високосный год).


 Критерии оценки
 Код работает корректно, при изменении значения переменной выдает верное значение.
 При изменении условий задачи в консоль выводится корректная фраза.
 Соблюдаются правила названия переменных и пунктуация.

# Задача 4
В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.

Правила доставки такие:

Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.

Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.

Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.


Критерии оценки
 Программа написана корректно, выдает верный результат при изменении значения переменной.
 При изменении значения переменной с расстоянием фраза, выведенная в консоль, корректируется.
 Соблюдаются правила синтаксиса и пунктуации.

# Задача 5
Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.

Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.

Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).


Подсказка
Чтобы решить задачу, изучите материал про оператор switch в шпаргалке.

 Критерии оценки
 Применили оператор switch.
 Прописали условие, при котором программа не будет выполняться.
 Корректно присвоили значение переменной.
 Соблюдаются правила синтаксиса и пунктуации.
