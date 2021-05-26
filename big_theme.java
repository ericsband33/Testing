package My_Package;

// Программа для отрабатывания тем: наследование классов, переропределение методов,
// интерфейсы, вложенные интерфейсы, методы с выполнением по умолчанию.

// Создать примитивную базу данных (набор массивов) на людей и разделить её на несколько сегментов,
// таких как: Несовершеннолетние (общие параметры), 18-30, 30-60, 60+.
// Каждой категории добавить свои элементы с использованием общих.

// Общие параметры: Пол (p)(String), год рождения (gr)(int), фамилия (surname)(String).
// 18-30 == Параметр образование (school)(case), место работы (work)(String).
// 30-60 == Параметр семейное положение (family)(boolean), дети (kids)(int).
// 60 +  == Параметр внуки (kids2)(int), рабочий стаж (workAge)(int).

// Структура: класс меню, суперкласс Общих параметров, иерархия поклассов (18-30; 30-60), подкласс 60 +.
// Функции: занесение записи, удаление записи, показать список фамилий,
// показать информацию по порядковому номеру.
import java.util.Scanner;
public class big_theme {
    public static void main(String[] args){
        basic Base = new basic();
        Scanner inp = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Выберите действие ");
            System.out.println("1. Внести данные ");
            System.out.println("2. Удалить данные ");
            System.out.println("3. Просмотр картотеки ");
            choise = inp.nextInt();
        switch (choise){
            case 1 : {Base.begin();} break;
            case 2 : {System.out.print("Удалить запись номер ");
                int x = inp.nextInt();
                Base.delete(x);
                System.out.println();} break;
            case 3 : {Base.show();} break;
        }
        } while (choise < 4);
        System.out.println("Всего доброго.");

    }
}
