package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwp34 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn���L�ĴX���B�z�O(1~10)!");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String str=br1.readLine();
		int res = Integer.parseInt(str);
		for(int i=1;i<=10;i++) {
			if(i==res)
				continue;
			System.out.println("��"+i+"�����B�z�C");
		
	}
	}
}
