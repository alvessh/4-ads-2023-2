public class MultiplicationTable {
    static void showMultiplicationTableOf(Integer number) {
        int maxNum = 10;
        int index = 1;

        do {
            System.out.println(number + "x" + index + "=" + (number * index));
            index++;
        } while (index < maxNum);
    }
}
