package fill.jma.LessonArray;

public class ArrayAverage {
    public void average(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length ;i++){
            sum = sum + array[i];
        }
        System.out.println("ArrayAverage = " + sum/array.length);
    }
}
