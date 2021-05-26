package fill.jma;

import fill.jma.LessonArray.ArrayAverage;
import fill.jma.LessonArray.ArrayMax;
import fill.jma.LessonArray.ArrayMin;
import fill.jma.LessonArray.ArrayRevers;

public class Main {
    public static void main(String[] args) {
        int []araay = {12, 15, 23, 34, 54, 56, 65, 64};
        ArrayMin arrayMin = new ArrayMin();
        arrayMin.arraymin(araay);
        ArrayMax arrayMax = new ArrayMax();
        arrayMax.arraymax(araay);
        ArrayAverage arrayAverage = new ArrayAverage();
        arrayAverage.average(araay);
        ArrayRevers arrayRevers = new ArrayRevers();
        arrayRevers.revers(araay);
        ArrayRevers arrayRevers1 = new ArrayRevers();
        arrayRevers1.writeArr(araay);
    }
}