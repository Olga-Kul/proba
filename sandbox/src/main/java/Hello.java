public class Hello {

    public static void main(String[] args) {
        hello("world");
        hello("user");

        double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area (len));
    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody);
    }
    //1) сначала выполняется функция main которая обращается к функции hello
    // и та в свою очередь выполнила фрагмент кода между ее фигурными скобками
    // { System.out.println("Hello World");}

    //2) добавили (String somebody) параметр/аргумент функции
    //  в том месте, где функция вызывается hello("world"); передаем конкретное значение для параметра
    // строчка "world" присваивается параметру функции somebody


    public static double area (double l) {
return  l*l;


// area - имя функции
    }
}

