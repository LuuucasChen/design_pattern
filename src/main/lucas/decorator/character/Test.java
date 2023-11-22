package main.lucas.decorator.character;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三");

        Sneakers sneakers = new Sneakers();
        //实现调用person的show
        sneakers.decorate(person);

        TShirts tShirts = new TShirts();
        //实现调用sneakers的show
        tShirts.decorate(sneakers);

        //调用tShirts的show
        tShirts.show();
    }
}
