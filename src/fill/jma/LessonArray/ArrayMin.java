package fill.jma.LessonArray;

public class ArrayMin {
    public void arraymin() {
        int minNum = 999999;
        int[] array = {12, 15, 23, 34, 54, 56, 65, 64};
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        System.out.println("minNum = " + minNum);
    }
}
