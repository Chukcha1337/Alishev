public class Formatirovanie {
    public static void main(String[] args) {
        System.out.printf("%f This is %s a string, %d \n", 10.7, "THE", 17); // После строки места с % идут по очереди
        // %s - вставить строку
        // %d - вставить unt
        // %f - вставить float
        System.out.printf("String %10d \n",543); // 10 тут значит ширина числа вне зависимости от его длины, числа идут справа
        System.out.printf("String %10d \n",1);
        System.out.printf("String %10d \n",13456);
        System.out.printf("String %10d \n",100000000);


        System.out.printf("String %-10d \n",543); // 10 тут значит ширина числа вне зависимости от его длины, числа идут СЛЕВА
        System.out.printf("String %-10d \n",1);
        System.out.printf("String %-10d \n",13456);
        System.out.printf("String %-10d \n",100000000);

        System.out.printf("String %.2f \n",543.2342342); // Это указывает сколько чисел после запятой оставить
    }
}
