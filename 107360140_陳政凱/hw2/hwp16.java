package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwp16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入A或B!");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=br1.readLine();
		char letter=str.charAt(0);
	
	switch(letter) {
		case 'A':{
			System.out.println("輸入的是A!");
			break;
		}
		case 'B':{
			System.out.println("輸入的是B!");
			break;
		}
		default:{
			System.out.println("請輸入A或B!");
			break;
		}
	
	}
	}

}
