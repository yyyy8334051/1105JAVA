package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwp45 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入5個人分數!");
		int test[]=new int[5];
		for(int i=0;i<test.length;i++) {
			String str=br1.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		for(int s=0;s<test.length-1;s++) {
			for(int t=s+1;t<test.length;t++) {
				if(test[t]>test[s]) {
					int tmp=test[t];
					test[t]=test[s];
					test[s]=tmp;
				}
			}
		}
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]+"分");
		
		
	}

}
}