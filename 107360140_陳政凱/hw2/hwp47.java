package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class hwp47 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J5�ӤH����!");
		Integer test[]=new Integer[5];
		for(int i=0;i<test.length;i++) {
			String str=br1.readLine();
			test[i]=Integer.parseInt(str);
		}
		Arrays.sort(test,Collections.reverseOrder());
		for(int i=0;i<test.length;i++) {
			System.out.println("��"+(i+1)+"�W�����ƬO"+test[i]+"��");
		
		
	}
	}

}
