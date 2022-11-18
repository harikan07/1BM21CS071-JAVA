import java.util.*;
import java.math.*;
class Dicriminant{
                 double a,b,c;
                 Dicriminant(double i,double j,double k)
                  {
                   a=i;
                   b=j;
                   c=k;
                  } 
                  double Discri()
                  {
                   return ((b*b)-(4*a*c));
                  }
               }
  
   
class Quadratic{
             public static void main(String args[])
            {
             Scanner sc=new Scanner(System.in);
             double r1,r2,a,b,c;
             System.out.println("enter the value of a");
             a=sc.nextInt();
             System.out.println("enter the value of b");       
             b=sc.nextInt();
             System.out.println("enter the value of c");
             c=sc.nextInt();
             if (a==0)
             {
                System.out.println("entered equation is not quadratic");
             }
             else
             { 
              Dicriminant d=new Dicriminant(a,b,c);
              if(d.Discri()>0)
              { 
                r1=(-b+Math.pow(d.Discri(),0.5))/(2*a);
                r2=(-b-Math.pow(d.Discri(),0.5))/(2*a);
                System.out.println("Roots are real and distinct:r1= "+r1 +  "r2=" +r2);
              }
              else if(d.Discri()<0)
              {
               r1=-b/(2*a);
               r2=(Math.pow(Math.abs(d.Discri()),0.5))/(2*a);
               System.out.println("Roots are complex: r1= "+r1+"+i"+r2+ " r2="+r1+"-i"+r2);
              }
             else 
             {
               r1=-b/(2*a);
               System.out.println("Roots are real and equal : r1=r2= "+r1);
            }
          }
       }
   }