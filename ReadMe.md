## Name: Kaustubh Singh 

-----------------------------------------------------------------------
-----------------------------------------------------------------------
Following are the commands and the instructions to run the project.

1) Clone the project from the git repository into your local directory
-----------------------------------------------------------------------
## Instruction to clone:

####Command: git clone "path of the project on github"

Description: It will clone the project on your local directory

-----------------------------------------------------------------------
## Instruction to compile:

####Command: javac PlenaData.java
Description: Compiles your code and generates .class files.

-----------------------------------------------------------------------
## Instruction to run: 

####Command: java PlenaData
Description: Will ask you the string input and based on the code written in the Result class will return the output

-----------------------------------------------------------------------
## Description:
1) I have assumed that the input string is case insensitive that is B and b are equal as for Bubble we are not taking B as a first unique character.
2) Now, once we get the first unique character I have implemented a code such that it will start printing the characters in order of number of occurrences and order.
3) For input string aaaalpiplaazzz it will print ilpplzzzaaaaaa --> i is the first unique character so it will go first, now both l and p occur 2 times so they will go in order of their occurrences that is lppl and now z is three times and no other character has frequency of three so it will go zzz and at last a is 6 times and no other character has frequency of 6 so it will go aaaaaa.
4) I have used String Builder as String Builder is faster in the case of string concatenation.
5) I have implemented my algorithm in Result class and my main class resides in PlenaData.java class
6) In PlenaData.java class inside main method I have asked for user input and then I called generateOutput method of the Result class and passed the input provided by the User.
7) Whatever returned from the generateOutput method I have printed it on console.
-----------------------------------------------------------------------
-----------------------------------------------------------------------

Date: [09/14/2020]


