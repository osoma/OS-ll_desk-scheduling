import java.util.*;
public class Main {


    public static void main(String []args)
    {
        // disk head starts at init
        int  init_head;//=53;
        int location_size;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter # of location: ");
        location_size=input.nextInt();
        System.out.println("Enter Head: ");
        init_head=input.nextInt();
        //maxreq maximum possible disk request
        int maxreq = 200; //the end of the cylinder
        //request array
        System.out.println("Enter the "+location_size+" requests: ");
        ArrayList<Integer> arr =new ArrayList<>();
        int value=0;
        for(int i=0;i<location_size;i++)
        {
            value=input.nextInt();
            arr.add(value);
        }
        /*arr.add(98);
        arr.add(183);
        arr.add(37);
        arr.add(122);
        arr.add(14);
        arr.add(124);
        arr.add(65);
        arr.add(67);*/
        ArrayList<Integer>temparray=new ArrayList<>(arr);


        FCFS object=new FCFS();
        System.out.println("FCFS_Total_Head_Movement: "+object.fcfs(arr,init_head)+"\n");

        SSTF sstfobj=new SSTF();
        System.out.println("SSTF_Total_Head_Movement: "+sstfobj.sstf(arr,init_head)+"\n");

        SCAN obj=new SCAN();
        int result=obj.scan(temparray,init_head,maxreq);
        System.out.println("SCAN_Total_Head_Movement:  "+result +"\n");
        NewOptimized newOptimized=new NewOptimized();
        System.out.println("Newly Optimized Algo_Total_Head_Movement: "+newOptimized.newOptimizedScheduling(temparray)+"\n");
    }
}
