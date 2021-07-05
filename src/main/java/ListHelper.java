import java.util.List;

public class ListHelper {
    public boolean exist(int number, int[] numberList) {
        List<Integer> integerList = Arrays.asList(numberList);
        return integerList.contains(number);
    }

    public boolean exist(int number, List<Integer> numberList) {
        return numberList.contains(number)
    }

    public static void main(String[] args) {
        ListHelper listHelper = new ListHelper();
        int[] numbers = new int[]{0, 1, 2};
        System.out.println(listHelper.exist(1, numbers));
    }
}
