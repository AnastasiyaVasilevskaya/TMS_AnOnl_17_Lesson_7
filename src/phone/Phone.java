package phone;

//    Создайте класс Phone, который содержит переменные number, model и weight.
//    Добавить в класс Phone методы:
//            receiveCall, имеет один параметр - имя звонящего. Выводит на консоль сообщение "Звонит {name)".
//            getNumber - возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.
//    Добавить конструктор, который принимает на вход два параметра для иициализации переменных класса - number, model.
//    Добавить конструктор без параметров.
//    Вызвать из конструктора с тремя параметрами конструктор с двумя.
//    Добавьте перегруженный метод receiveCall, который принимает два параметра -
//            имя звонящего и номер телефона звонящего. Вызвать этот метод.
//    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
//    которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

import java.util.Arrays;

public class Phone {
    private String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this("number", "model", 0);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "\nНомер " + number + "\n");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщения отправлены на номера: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Номер: " + number + "\nМодель телефона: " + model + "\nВес: " + weight + "\n";
    }
}
