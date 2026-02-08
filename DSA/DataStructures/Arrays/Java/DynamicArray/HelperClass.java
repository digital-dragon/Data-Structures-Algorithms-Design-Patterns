public class HelperClass {
    public static void addStrings() {
        DynamicArray<String> stringList = new DynamicArray<>();
        for (int i = 0; i < 5; i++) stringList.push(String.valueOf(i * 10));
        stringList.print();
    }

    public static void addDemoObjects() {
        DynamicArray<DemoClass> demoClassList = new DynamicArray<>();
        for (int i = 0; i < 21; i++) demoClassList.push(new DemoClass(i));
        demoClassList.print();

        System.out.println(demoClassList.pop());
        demoClassList.print();
    }

    public static void addIntegers() {
        DynamicArray<Integer> integerList = new DynamicArray<>();
        for (int i = 0; i < 25; i++) integerList.push(i);
        integerList.print();

        for (int i = 0; i < 12; i++) integerList.pop();

        integerList.push(5,5,5);
        Integer[] ar = {6,7,8};
        integerList.push(ar);
        integerList.unShift(99,100,101);
        integerList.print();
        integerList.shift();
        integerList.print();
        var v = integerList.shift();
        System.out.println(v);
        integerList.print();

        System.out.println(integerList.every(x -> x > 5));
        System.out.println(integerList.some(x -> x > 5));
        System.out.println(integerList.size());

    }
}
