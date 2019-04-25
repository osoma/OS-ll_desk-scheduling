import java.util.ArrayList;

public class FCFS {
    public static int fcfs(ArrayList<Integer>arr, int init/*head*/)
    {
        int Total_Head_Movement=0;
        for (int i = 0; i < arr.size(); i++) {

            Total_Head_Movement+=Math.abs(arr.get(i) -init);
            init= arr.get(i);

            System.out.println(arr.get(i));
        }

        //System.out.println("\n"+"FCFS_Total_Head_Movement: "+Total_Head_Movement);
        return Total_Head_Movement;
    }
}
