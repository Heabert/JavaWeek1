package chapter03;

	
	public class Square {
			int length;
			static int count=0;
			Square()
			{
				length=2;
				count++;
			}
			
			Square(int l)
			{
				length=l;
				count++;
			}
			
			int getArea()
			{
				return length*length;
			}
			
			 int getPerimeter()
			{
				return 4*length;
			}
			
			 static int noofobj()
			 {
				 return count;
			 }
			 
			 public void printSqaure(Square s) {
				 System.out.println(""+s.length+""+s.getArea());
				}
			 
			public static void main (String[] args)
			{
				Square Square1=new Square();
				System.out.println("The area of Square of length "
				+Square1.length+ " is "+Square1.getArea());
				
				System.out.println("The perimeter of Square of length "
						+Square1.length+ " is "+Square1.getPerimeter());
				
				System.out.println("-------");
				
				Square Square2=new Square(10);
				System.out.println("The area of Square of length "
				+Square2.length+ " is "+Square2.getArea());
				
				System.out.println("The perimeter of Square of length "
						+Square2.length+ " is "+Square2.getPerimeter());
				
				System.out.println("-------");
				Square Square3=new Square(20);
				System.out.println("The area of Square of length "
				+Square3.length+ " is "+Square3.getArea());
				
				System.out.println("The perimeter of Square of length "
						+Square3.length+ " is "+Square3.getPerimeter());
				
				System.out.println("The no of object are "+Square.noofobj());
			}

		}
	
	

