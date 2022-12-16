import java.util.*;
abstract class shape
{
 int a,b;
 abstract void printArea();
}

class rectangle extends shape
{ 
 void getdata(int x,int y)
 {
  a=x;
  b=y;
 }
 void printArea()
 { 
  double x=a*b;
  System.out.println("Area of rectangle is  "+x);
 }
}

class triangle extends shape
{ 
 void getdata(int x,int y)
 {
  a=x;
  b=y;
 }
 void printArea()
 { 
  double area=0.5*a*b;
  System.out.println("Area of Triangle is  "+area);
 }
}

class circle extends shape
{ 
 void getdata(int x)
 {
  a=x;
 }
 void printArea()
 { 
  double area=3.14*a*a;
  System.out.println("Area of circle is  "+area);
 }
}


class abstr{
             public static void main(String args[])
            {
             Scanner scan=new Scanner(System.in);
             int choice;
             rectangle r=new rectangle();
             triangle t=new triangle();
             circle c=new circle();
             System.out.println("1.Rectangle  2.Triangle 3.Circle");
             System.out.println("Enter your choice");
             choice=scan.nextInt();
             switch(choice)
             {
              case 1:System.out.println("Enter value of length and breadth");
                     int l=scan.nextInt();
                     int b=scan.nextInt();
                     r.getdata(l,b);
                     r.printArea();
                     break;

               case 2:System.out.println("Enter value of base and height");
                      int b1=scan.nextInt();
                      int h=scan.nextInt();
                      t.getdata(b1,h);
                      t.printArea();
                      break;

               case 3:System.out.println("Enter value of radius");
                      int r1=scan.nextInt();
                      c.getdata(r1);
                      c.printArea();
                      break;

               default:System.out.println("Invalid choice!!!");
              }
            }
          }