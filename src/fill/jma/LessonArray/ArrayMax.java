package fill.jma.LessonArray;

public class ArrayMax {
    public void arraymax(){
        int maxNum = 0;
        int[] array = {12, 15, 23, 34, 54, 56, 65, 64};
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        System.out.println("maxNum = " + maxNum);
    }
}
