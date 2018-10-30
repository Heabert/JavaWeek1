package ChapterTwo;

public class ScienctificNotiationsPrintTheResults {
	public static void main(String [] args) {
		System.out.println(5.2534e+1);
		System.out.println(525.34e-1);
		System.out.println(525.34e+0);
	

 
// Prefix and post fix

int i=10;
int num=10*(++i);

System.out.println("i is " + i + " new NO. is " + num);

int j=10;
int num2=10*(j++);
System.out.println("j is " + j + " new NO. " + num2);


//print the value of a and b

int a=6;
int b=a++;

System.out.println("a is " + a + " new NO. " + b);

int c=6;
int d=--c;

System.out.println("c is" + c + "new NO." + d);


//TYPE CASTING

//Implicit type conversion 
//converting the bigger data type
System.out.println(3*3.2F);

//explicit type conversion
System.out.println((int)1.3);
System.out.println((double)1/2);
System.out.println(1/2);





	}

}
