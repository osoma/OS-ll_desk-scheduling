import java.util.ArrayList;

public class SSTF {
    public static int sstf(ArrayList<Integer> arr, int init/*head*/)
    {
        int Total_Head_Movement=0;
        while (arr.size()!=0)
        {
            int smallest_Value=Integer.MAX_VALUE,smallest_index=-1;
            for (int i = 0; i < arr.size(); i++) {
                int temp=Math.abs(arr.get(i)-init);
                if(temp<smallest_Value)
                {
                    //System.out.println("yes "+ temp+"   "+i);
                    smallest_Value=temp;
                    smallest_index=i;

                }
            }
            init=arr.get(smallest_index);
            System.out.print(smallest_index+"    ");
            System.out.print(arr.get(smallest_index)+"   \n");
            Total_Head_Movement+=smallest_Value;
            arr.remove(smallest_index);
        }
        //System.out.println("\n"+"SSFS_Total_Head_Movement: "+Total_Head_Movement);
        return Total_Head_Movement;
    }

}
