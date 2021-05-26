package fill.jma.LessonArray;

public class ArrayMin {
    public void arraymin(int array[]) {
        int minNum = 999999;
        for (int i = 0; i < array.length; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        System.out.println("minNum = " + minNum);
    }
}
