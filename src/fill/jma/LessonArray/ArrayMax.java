package fill.jma.LessonArray;

public class ArrayMax {
    public void arraymax(int array[]){
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        System.out.println("maxNum = " + maxNum);
    }
}
