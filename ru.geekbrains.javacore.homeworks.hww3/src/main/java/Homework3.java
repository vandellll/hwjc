public class Homework3 {
    public static void swap(Object[] arr, int srcIndex, int dstIndex) {
        Object temp = arr[srcIndex];
        arr[srcIndex] = arr[dstIndex];
        arr[dstIndex] = temp;
    }

    public static void printArr(Object[] arr) {
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] strArr = new String[] {"first", "second", "third", "fourth", "fifth"};
        Integer[] intArr = new Integer[] {1, 2, 3, 4, 5};
        Double[] dblArr = new Double[] {1.5, 2.5, 3.5, 4.5, 5.5};

        swap(strArr, 1, 3);
        swap(intArr, 1, 3);
        swap(dblArr, 1, 3);

        printArr(strArr);
        printArr(intArr);
        printArr(dblArr);
        System.out.println();

        Box <Apple> appleBox = new Box<>();
        System.out.println(appleBox);
        appleBox.add(new Apple());
        System.out.println(appleBox);
        appleBox.add(new Apple());
        System.out.println(appleBox);
        appleBox.add(new Apple());
        System.out.println(appleBox);
        System.out.println();

        Box <Orange> orangeBox = new Box<>();
        System.out.println(orangeBox);
        orangeBox.add(new Orange());
        System.out.println(orangeBox);
        orangeBox.add(new Orange());
        System.out.println(orangeBox);
        orangeBox.add(new Orange());
        System.out.println(orangeBox);
        System.out.println();

        Box <Apple> appleBox2 = new Box<>();
        System.out.println(appleBox2);
        appleBox2.add(new Apple());
        System.out.println(appleBox2);
        System.out.println();

        Box <Orange> orangeBox2 = new Box<>();
        System.out.println(orangeBox2);
        orangeBox2.add(new Orange());
        System.out.println(orangeBox2);
        orangeBox2.add(new Orange());
        System.out.println(orangeBox2);
        System.out.println();

        System.out.println("Box1 weight is " + appleBox.getWeight() + "kg (apples)");
        System.out.println("Box2 weight is " + orangeBox.getWeight() + "kg (oranges)");
        System.out.println("Box3 weight is " + appleBox2.getWeight() + "kg (apples)");
        System.out.println("Box4 weight is " + orangeBox2.getWeight() + "kg (oranges)");
        System.out.println();

        String temp = (appleBox.compare(orangeBox)) ? "are equal" : "are not equal";
        System.out.println("Box1 and Box2 " + temp);
        temp = (appleBox.compare(appleBox2)) ? "are equal" : "are not equal";
        System.out.println("Box1 and Box3 " + temp);
        temp = (appleBox.compare(orangeBox2)) ? "are equal" : "are not equal";
        System.out.println("Box1 and Box4 " + temp);
        System.out.println();

        appleBox.poor(appleBox2);
        orangeBox.poor(orangeBox2);
        System.out.println(appleBox);
        System.out.println(orangeBox);
        System.out.println(appleBox2);
        System.out.println(orangeBox2);
    }
}

