package day13;

public class Test {
    public static void main(String[] args) {
        User popovchick = new User("Саша Попов");
        User limalool = new User("Даша Лима");
        User ellie = new User("Элли Попова");

        popovchick.sendMessage(limalool, "Привет, красотка");
        popovchick.sendMessage(limalool, "Как поживаешь?");

        limalool.sendMessage(popovchick, "норм");
        limalool.sendMessage(popovchick, "кушаю");
        limalool.sendMessage(popovchick, "а ты?");

        popovchick.sendMessage(limalool, "Да норм, только холодно");
        MessageDatabase.sendMessage(popovchick,limalool,"<3");

        ellie.sendMessage(popovchick, "Мяу!");
        ellie.sendMessage(popovchick, "Мрррр");
        ellie.sendMessage(popovchick, "Мяу, мяу, мяу");

        popovchick.sendMessage(ellie, "Элли, успокойся");
        popovchick.sendMessage(ellie, "Может, мы хотим...");
        popovchick.sendMessage(ellie, "Куууушать?");

        ellie.sendMessage(popovchick, "МЯЯЯУ!");

        MessageDatabase.showDialog(popovchick,ellie);
        System.out.println();
        MessageDatabase.showDialog(popovchick,limalool);
        System.out.println();
        System.out.println(MessageDatabase.getMessages());
        popovchick.subscribe(limalool);
        popovchick.subscribe(ellie);
        System.out.println(popovchick.isSubscribed(limalool));
        System.out.println(popovchick.isSubscribed(ellie));
        System.out.println(popovchick.isFriend(limalool));
        limalool.subscribe(popovchick);
        System.out.println(popovchick.isFriend(limalool));

    }
}
