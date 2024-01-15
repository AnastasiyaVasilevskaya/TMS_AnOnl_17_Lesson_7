package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375447276568", "Iphone 13", 200);
        Phone phone2 = new Phone("+375297841244", "Samsung Galaxy");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone2.receiveCall("Дима", "+375333465366");

        phone3.sendMessage("+375000000000", "+375001111111", "+375442222222");

        System.out.println("Номер первого телефона " + phone1.getNumber());
    }


}
