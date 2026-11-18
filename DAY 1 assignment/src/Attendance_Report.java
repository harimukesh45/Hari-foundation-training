import java.lang.reflect.Array;
import java.util.ArrayList;

public class Attendance_Report {
    public static void main(String[] args)
    {
        int[] array = new int[10];
        int[] SumArray = new int[array.length+1];

        array[0]=10;
        array[1]=15;
        array[2]=12;
        array[3]=16;
        array[4]=12;
        array[5]=13;
        array[6]=11;
        array[7]=9;
        array[8]=13;
        array[9]=12;

        SumArray[0]=0;
        for(int i=1;i<SumArray.length;i++){
            SumArray[i]=SumArray[i-1]+array[i-1];
        }

        int startDay=3;
        int endDay=7;
        if(startDay >= 1 && endDay <= 10 && startDay <= endDay)
        {
        System.out.println("Day "+startDay+" to Day "+endDay+" is "+(SumArray[7] - SumArray[3]));
        }

        //Highest Attendance
        int maxi=-1;
        int index=-1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>maxi)
            {
                maxi=array[i];
                index=i;
            }
        }
        System.out.println("Day with Highest attendance is " + (index+1) +" with "+maxi+" members");
    }
}
