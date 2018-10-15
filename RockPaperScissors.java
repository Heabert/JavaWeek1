package chapter4;

import java.util.Random;
import java.util.Scanner;

public static void main(String args[]) {
	       int w =0 , l =0, d=0, i=0;
	    Scanner comp = new Scanner(System.in);
	    
	    while (i<20) {


	        System.out.println("scissor(1) ,Rock(2),Paper(3) ");
	        int n = comp.nextInt();
	        int m =(int)(Math.random()*3+1);


	        if(n==m){

	            System.out.println("Com:"+m +"so>>> " + "draw");
	            d++;


	        }else if ((n-1)%3==(m%3)){
	            w++;
	            System.out.println("Com:"+m +"so>>> " +"win");
	        }
	        else if(n >=4 )
	        {
	            System.out.println("pleas enter correct number");


	    }
	        else {
	            System.out.println("Com:"+m +"so>>> " +"lose");
	            l++;

	        }
	        i++;
	}
	}
}
