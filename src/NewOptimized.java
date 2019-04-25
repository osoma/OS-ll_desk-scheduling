import java.util.*;

public class NewOptimized
{        /*
        ....IDHP = Initial Disk Head Position DQ = Disk Queue with requests TR = Track Request....HP = Head Position
        PLTR = Position of Last Track Request.... THM = Total Head Movements*/

    public static int newOptimizedScheduling(ArrayList<Integer>arr) {
        int init_head = 0, Total_Head_Movement = 0;

        Collections.sort(arr);// sorting the list of requests
        //for (int x=0;x<arr.size();x++)
        //  System.out.println(arr.get(x));
        for (int i = 0; i < arr.size(); i++) {
            Total_Head_Movement += Math.abs(arr.get(i) - init_head);
            init_head = arr.get(i);
            System.out.println(arr.get(i));

        }
        //System.out.println("asd");
        return Total_Head_Movement;
    }
}

