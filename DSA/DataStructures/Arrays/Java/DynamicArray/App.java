public class App {
    public static void main(String[] args) {
        DynamicArray<String> stringList = new DynamicArray<>();
        for (int i = 0; i < 5; i++) stringList.push(String.valueOf(i * 10));
        stringList.print();

        DynamicArray<DemoClass> demoClassList = new DynamicArray<>();
        for (int i = 0; i < 21; i++) demoClassList.push(new DemoClass(i));
        demoClassList.print();

        System.out.println(demoClassList.pop());
        demoClassList.print();

        DynamicArray<Integer> integerList = new DynamicArray<>();
        for (int i = 0; i < 25; i++) integerList.push(i);
        integerList.print();

        for (int i = 0; i < 12; i++) System.out.println(integerList.pop());

        integerList.print();
    }
}
