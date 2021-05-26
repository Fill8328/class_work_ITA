package fill.jma.LessonArray;

public class ArrayAverage {
    public void average(){
        int []araay = {12, 15, 23, 34, 54, 56, 65, 64};
        int sum = 0;
        for (int i = 0; i < araay.length ;i++){
            sum = sum + araay[i];
        }
        System.out.println("ArrayAverage = " + sum/araay.length);
    }
}
