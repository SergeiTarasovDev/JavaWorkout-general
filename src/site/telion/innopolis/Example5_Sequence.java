package site.telion.innopolis;

public class Example5_Sequence {
    public static int[] map(int array[], Example5_Mapper mapper) {
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] process(int[] array, Example5_TwoNumbersMapper mapper) {
        int result[] = new int[array.length / 2];
        int current = 0;
        for (int i = 0; i < array.length - 1; i++) {
            result[current] = mapper.map(array[i], array[i + 1]);
            current++;
            i += 1;
        }
        return result;
    }
}
