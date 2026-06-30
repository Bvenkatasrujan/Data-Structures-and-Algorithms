Java Pattern Programs - Learn How to Print Pattern in Java
Last Updated : 19 Jan, 2026
In many Java interviews Star, number, and character patterns are the most asked Java Pattern Programs to check your logical and coding skills. Pattern programs in Java help you to sharpen your looping concepts (especially for loop) and problem-solving skills in Java. If you are looking for a place to get all the Java pattern programs with solutions, stop your search here.

Here, we have compiled a top pattern exercises on Java.

Prerequisite: Remember that to learn pattern programs, you must know Java Loops (for, while, do-while) and basic syntax.

Patterns Programs in Java
Patterns Programs in Java
Java Pattern Programs

Reference Website url:https://www.geeksforgeeks.org/java/java-pattern-programs/
Here, you will find the top 25 Java pattern programs with their proper code and explanation. 

All Pattern Programs in Java are mentioned below:

1. Square Hollow Pattern
This program prints a square where the border is filled with stars (*), and the inside is hollow (filled with spaces).




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            
            //  inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                
                // otherwise print space only
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
******
*    *
*    *
*    *
*    *
******
2. Number Triangle Pattern
Prints a right-angled triangle with numbers in increasing row order, aligned to the right.




import java.util.*;
​
public class Geeks {
    
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            // print new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
3. Number-Increasing Pyramid Pattern 
Prints a pyramid where each row contains numbers from 1 to the row number.




import java.util.*;
​
public class Geeks {
    
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // printing column values 
                // upto the row value
                System.out.print(j + " ");
            }
​
            // print new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
4. Number-Increasing Reverse Pyramid Pattern
This is a reverse pyramid where each row starts from 1 and ends at the row count, in decreasing number of elements.




import java.util.*;
​
public class Geeks {
        public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
          
        // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // printing column values 
                // upto the row value
                System.out.print(j + " ");
            }
​
            // print new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
5. Number-Changing Pyramid Pattern
Prints a pyramid where numbers increase continuously from top to bottom.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // printing value of num in each iteration
                System.out.print(num + " ");
                
                // increasing the value of num
                num++;
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
6. Zero-One Triangle Pattern
Prints a triangle where each number alternates between 1 and 0 based on the position.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        
        //outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            //inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }
​
            //printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
7. Palindrome Triangle Pattern
Prints a triangle with mirrored numbers forming a palindrome on each row.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
​
            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
​
            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 
8. Rhombus Pattern
Prints a rhombus (tilted square) made of stars, shifted by spaces.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
​
            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     ******
    ******
   ******
  ******
 ******
******
9. Diamond Star Pattern
Prints a diamond shape made of stars.




import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
​
        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
10. Butterfly Star Pattern
Prints a butterfly-shaped pattern using stars (*).




import java.util.*;
​
public class Geeks {
  
    public static void printPattern(int n)
    {
        // Outer loop to handle the upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
              
                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }
                
                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
​
        // Outer loop to handle the lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {
              
                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }
                
                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String[] args)
    {
        // Number of rows
        int n = 6; 
        printPattern(n);
    }
}

Output
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *
11. Square Fill Pattern
This program prints a filled square of stars (*) with n+1 rows and columns.




import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
​
            // inner loop to handle columns
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
******
******
******
******
******
******
12. Right Half Pyramid Pattern
This creates a right-angled triangle aligned to the left using stars.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
​
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
*
**
***
****
*****
******
13. Reverse Right Half Pyramid Pattern
This prints a right-aligned triangle but in reverse top to bottom.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
​
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
******
*****
****
***
**
*
14. Left Half Pyramid Pattern
This pattern aligns a triangle to the right by adding spaces before stars.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
​
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
​
            // inner loop to print stars.
            for (j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     *
    **
   ***
  ****
 *****
******
15. Reverse Left Half Pyramid Pattern
This prints a left pyramid in reverse, starting from full-width and decreasing.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = n; i > 0; i--) {
            
            // inner loop to print spaces.
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars.
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
******
 *****
  ****
   ***
    **
     *
16. Triangle Star Pattern
This prints an equilateral triangle where stars are spaced apart.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
            
            // inner loop to print spaces.
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
​
            // inner loop to print stars.
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
17. Reverse Number Triangle Pattern
A reverse right-aligned triangle with ascending numbers from i to n.




import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
​
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
​
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
18. Mirror Image Triangle Pattern
This creates a mirrored triangle with numbers, forming a diamond-like shape.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        
        // Printing the upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
​
            // printing new line for each row
            System.out.println();
        }
​
        // Printing the lower part
        for (i = n - 1; i >= 1; i--) {
            
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 
19. Hollow Triangle Pattern
This prints a hollow equilateral triangle using stars with only the boundary.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j, k;
​
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
          
            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
          
            for (k = 1; k <= (2 * i - 1); k++) {
                
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
​
            System.out.println("");
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     *
    * *
   *   *
  *     *
 *       *
***********
20. Hollow Reverse Triangle Pattern
Prints an inverted hollow triangle with stars only at boundaries and top row.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j, k;
​
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
​
            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
​
            for (k = 1; k <= (2 * i - 1); k++) {
                
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
​
            System.out.println("");
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
***********
 *       *
  *     *
   *   *
    * *
     *
21. Hollow Diamond Pyramid
Prints a symmetrical hollow diamond made of stars, with spaces in the middle and stars only at the borders.




import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
​
        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
  
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *
22. Hollow Hourglass Pattern
Displays a hollow hourglass using stars, where only boundary stars are visible in a symmetric hourglass shape.




import java.util.*;
​
public class Geeks {
  
    public static void printPattern(int n)
    {
        int i, j;
      
        // Printing the upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                if(j==i||j==n||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
​
            // printing new line for each row
            System.out.println();
        }
​
        // Printing the lower part
        for (i = n - 1; i >= 1; i--) {
            
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                if(j==i||j==n||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
* * * * * * 
 *       * 
  *     * 
   *   * 
    * * 
     * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 
23. Pascal's Triangle
Generates Pascal’s Triangle with proper alignment, showing binomial coefficients for each row.




import java.util.*;
​
class Geeks {
​
    public static void printPascal(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
​
                // for left spacing
                System.out.print(" ");
            }
​
            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {
​
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
​
    // Driver code
    public static void main(String[] args)
    {
        int n = 4;
        printPascal(n);
    }
}

Output
    1 
   1 1 
  1 2 1 
 1 3 3 1 
24. Right Pascal’s Triangle
Forms a right-angled triangle pointing upward and downward, creating a right Pascal’s triangle shape.




import java.util.*;
​
public class Geeks {
​
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
​
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
​
            System.out.println();
        }
​
        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
​
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 4;
        printPattern(n);
    }
}

Output
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 
25. K Pattern
Prints an inverted and then upright right half pyramid (like K shaped), forming a symmetrical star pattern.




import java.util.*;
​
public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
​
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
​
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
​
        // outer loop to handle rows
        for (i = 2; i <= n; i++) {
​
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
​
            // printing new line for each row
            System.out.println();
        }
    }
​
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

Output
******
*****
****
***
**
*
**
***
****
*****
******

