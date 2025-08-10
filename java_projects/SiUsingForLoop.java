// package siusingforloop ; 
import java.util.* ; 
 
public class SiUsingForLoop 
{ 
 public static void main ( String[ ] args ) 
 { 
  float  p, r, si ; 
  int  n, count ; 
  Scanner scn ; 
   
  scn = new Scanner ( System.in ) ;   
  for ( count = 1 ; count <= 3 ; count = count + 1 ) 
  { 
   System.out.println ( "Enter values of p, n and r" ) ; 
   p = scn.nextFloat( ) ; 
   n = scn.nextInt( ) ; 
   r = scn.nextFloat( ) ; 
   si = p * n * r / 100 ; 
   System.out.println ( "Simple Interest = Rs. " + si ) ; 
  } 
 } 
} 