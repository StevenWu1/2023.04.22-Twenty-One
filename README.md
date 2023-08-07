# 2023.04.22-Twenty-One
Dory likes playing the game of 21 with her other fish friends in the Open Ocean Exhibit. Players take turns finding sea shells - a regular sea shell is worth 1 point, a purple sea shell (her mom's favorite!) is worth 2 points, and finding no sea shells is worth 0 points. A player loses their turn when they can find no more sea shells. If a player has 13 points on their turn and they can't find a sea shell, then their score goes back to 0. If a player goes over 21 points on their turn, then their score goes back to 13 (they don't lose their turn). You're tasked with a program to help automate score keeping.

https://drive.google.com/file/d/0BxxolsFkwnDqaTFSRTFmcWhlSk0/view?usp=sharing

##### Input Format
On one line, a number n representing the number of moves in a game of Twenty One, followed by n numbers, representing the value of shell picked up by the current player, all separated by spaces.

##### Constraints
0 <= n <= 1000 Each shell value will either be 0, 1, or 2

##### Output Format
FIRST PLAYER, if player one wins, SECOND PLAYER, if second player wins, or UNDECIDED, if no one has won yet

##### Sample Input 0
11 2 2 2 2 2 2 2 2 2 2 1

##### Sample Output 0
FIRST PLAYER

##### Sample Input 1
13 2 2 2 2 2 2 1 0 0 2 2 2 2

##### Sample Output 1
UNDECIDED

##### Sample Input 2
16 1 0 2 1 2 1 2 1 2 1 2 1 2 1 2 1

##### Sample Output 2
SECOND PLAYER
