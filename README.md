#Program Description
The MyStringBuilder program is designed to be a program that builds a word 
out of letters that are input into the program. each letter that is requested
to be added to the new word being generated, is attached to the end of the
new word. There is also an option to delete a letter at any point in the word,
add a new letter, or delete/add a sequence of letters, including the entire 
word. This program will also be used to draw letters and unique designs on 
a canvas on the screen using turtles to draw each letter or design. 

#Pointer Questions
1. The main benefits of using pointers to build a MyStringBuilder object
to act as a StringBuilder, is efficient use of data structures, and a
design that allows for fast execution. The objects dont need to store any
unecessary data, and the java garbage collection will take care of objects
with Null pointers.

2.In order to reuse a node you would have to make a reference to the 
Character node as some type of copy variable, and then point the reference
at the CharcterNode that contains the char that you want to point to, 
then point the reference again at the next CharacterNode while pointing the 
previous nodes nextNode point to the new reference. 

3.  Threading allows for multiple tasks to be taken care of at one time 
on different threads. Some of the benefits are avoiding blocking on background
actions MS word formatting, Server connection threading, improve efficiency.
Multithreading doesnt always guarantee a speedup in performance, since it 
depends also on the cores. We used the join method to put a hold on the 
final thread to wait on the previous threads to finish execution. 
