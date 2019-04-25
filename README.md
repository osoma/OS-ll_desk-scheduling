# OS-ll_desk-scheduling console applecation
FCFS , SSTF , SCAN and Newly optimized Algorithm for desk scheduling. 

to run this code ,you should enter the number of requests then the initial head position and the list of requests.
And this is the description of those techniques:

* The First Come First Served (FCFS) algorithm is simplest
form of disk scheduling algorithm.

* The Shortest-Seek-Time-First(SSTF) disk scheduling
algorithm head serves the request first that have minimum
seek time from the current head position. As the seek time
increases with the numbers of tracks traversed by the head,
the SSTF algorithm first chooses the pending requests close to
the current head position.

* In this algorithm"SCAN" the head starts at one end of the disk and
moves towards the other end of the disk, servicing requests as
it reaches each track, until it reach to the other end of the disk.
After reaching the other end of the disk, the direction of head
is reversed and servicing continues. It is some time called the
Elevator algorithm because in this algorithm the disk arm
behaves like an elevator.
Let as return to the same example. In this algorithm we need
to know the direction of head in addition to the current
position of the head. Let the disk arm is moving towards 0 and
initial head position is 120. Queue: 38, 180, 130, 10, 50, 15,
190, 90 and 150.

* In this proposed algorithm"newly optimized algorithm", initially the disk head is at the
position 0 and has the direction towards the position 200. It
means initial head position and direction of head is always
same. First we sort all the cylinders input blocks by using any
sorting algorithm. Initially the head is at position 0 and
sequentially moves and reached from this block to the highest
input block number, servicing all the input request blocks in
front of the head immediately.
