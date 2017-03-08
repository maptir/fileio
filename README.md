#FileIO (Input and Output)

Calculate the time when copy a very big text file like Big-Alice-in-Wonderland.txt
by 6 way and calculate it elapsed time.

Result:
         Task			    |     Elapsed Time	
----------------------------|--------------------
Copy a file byte-by-byte	|     4.151571 sec
Copy a file 1KB-per-array   |     0.013256 sec
Copy a file 4KB-per-array   |     0.006637 sec
Copy a file 64KB-per-array  |     0.002532 sec
Copy a file line-by-line    |     0.150848 sec
Copy a file by-char-array   |     0.044405 sec

In the first task we can see that it is a longest task because this task copy a text by 1 byte per time
then the program must run equal to number of byte in the file so it take a longest time. 

Next task from task 2-4 are using the byte array to copy the file so it faster than the first task.
In task 2 take less time than task 3 and 4 because the computer can copy more byte in one time but its 
doesn't mean that if you use more than 64KB it will faster maybe it can be slower than if you use like 256KB or 512KB.
It's just like if you want to move book in your room if you still can carry more book in your hand then you should 
do it so you haven't to walk many time but if you can't carry more book and you try to bring more it will make you slow not fast.

