
public class Binary {
    public static void searchFor(Integer key, Integer[] numArray) {
        int first = 0;
        int last = numArray.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (numArray[mid] < key)
                first = mid + 1;
            else if (numArray[mid] == key)
                System.out.println("Encontramos o número em " + mid);
            else
                last = mid - 1;
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Número não encontrado");
        }
    }

}