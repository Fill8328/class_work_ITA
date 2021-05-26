package fill.jma.LessonArray;

public class ArrayRevers {
    public void revers(int araay[]){
        int i = 0;
        int temp = 0;
        int length = araay.length - 1;
        while (i < length){
            temp = araay[i];
            araay[i] = araay[length];
            araay[length] = temp;
            i++;
            length--;
        }
    }
    public void writeArr(int araay[]){
        System.out.print(" ArrayRevers ");
        for (int j = 0; j < araay.length; j++) {
            System.out.print(" " + araay[j]);
        }
    }
}


