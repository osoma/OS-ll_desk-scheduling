import java.util.*;
public class SCAN {
    public static int scan(ArrayList<Integer> arrayList, int init/*head*/, int maxreq) {

        int Total_Head_Movement = 0, len = arrayList.size();
        int []arr=new int[arrayList.size()];
        //sorting the requests
        for(int i=0;i<arrayList.size();i++)
        {
            arr[i]=arrayList.get(i);
        }
        Arrays.sort(arr);
       // Collections.sort(arrayList);

        int pos = Arrays.binarySearch(arr, init);// (-insertion point)-1.
       // System.out.println(pos);
        pos = -pos - 1;
        //System.out.println(pos);
        int left = pos - 1, right = pos;

        //moving towards right side first in the array
        Total_Head_Movement += Math.abs(init - arr[right]);
        System.out.println(arr[right]);
        while (right < len - 1) {
            Total_Head_Movement += Math.abs(arr[right] - arr[right + 1]);
            System.out.println(arr[right + 1]);
            right++;
        }
        Total_Head_Movement += Math.abs(arr[len - 1]- maxreq);
        //System.out.println(maxreq);

        //now moving towards left direction .
        Total_Head_Movement += Math.abs(maxreq - arr[left]);
        System.out.println(arr[left]);

        while (left != 0) {
            Total_Head_Movement += Math.abs(arr[left] - arr[left - 1]);
            System.out.println(arr[left - 1]);
            left--;
        }
        return Total_Head_Movement;
    }
}