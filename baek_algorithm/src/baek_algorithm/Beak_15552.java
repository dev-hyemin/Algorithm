package baek_algorithm;
import java.util.*;
import java.io.*;
public class Beak_15552 {

	public static void main(String[] args){
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		try {
			int t=Integer.parseInt(bf.readLine());
			
			for(int i=0;i<t;i++) {
				st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a+b+"\n");
			}
			bw.flush();
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
