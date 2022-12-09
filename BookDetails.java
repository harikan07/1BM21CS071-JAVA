import java.util.*;
class Book
         {
          String title;
          String author;
          double price;
          int numPages;
         
         
          Book()
                {
                 title="Default";
                 author="Default";
                 price=0.00;
                 numPages=0;
                }
        
         void SetTitle(String t)
                {
                 title=t;
                }

         void SetAuthor(String a)
                {
                 author=a;
                }
            
         void SetPrice(double p)
                {
                 price=p;
                }


         void SetPages(int np)
                {
                 numPages=np;
                }

         public String toString()
                 {
                   return title+"\t\t"+author+"\t\t"+price+"\t\t"+numPages;
                 }
               }


  class BookDetails{
                    public static void main(String args[])
                    {
                      String t;
                      String a;
                      double p;
                      int np,n;
                      Scanner sc=new Scanner(System.in);
                      System.out.println("Enter the number of Books");
                      n=sc.nextInt();
                       
                      Book b[]=new Book[n];
                      for(int i=0;i<n;i++)
                      {
                        System.out.println("Enter the title of Book");
                        t=sc.next();
                        System.out.println("Enter the author of Book");
                        a=sc.next();
                        System.out.println("Enter the price of Book");
                        p=sc.nextDouble();
                        System.out.println("Enter the number of pages of Book");
                        np=sc.nextInt();

                        b[i]=new Book(); 
                        b[i].SetTitle(t);
                        b[i].SetAuthor(a);
                        b[i].SetPrice(p);
                        b[i].SetPages(np);
                       }
                        
                       System.out.println("Title"+"\t"+"Author"+"\t"+"Price"+"\t"+"Pages");
                       for(int i=0;i<n;i++)
                       {
                         System.out.println(b[i]);
                       }
                    }
                 }
                     



                     


                        
                        
