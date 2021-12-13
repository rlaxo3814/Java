package mc.sn.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileTest ft = new FileTest();
		try {
			ft.test2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test1() {
		File file = new File("./data/Abc1115.csv");
		if(file.exists()) {//exists존재하는지 물어보는것임
			String name =file.getName();
			long size = file.length();// length의 리턴타입이 long이다
			System.out.println(name+":"+size);
		} else {
			System.out.println("해당 파일이 존재하지 않습니다");
		}
	}
	public void test2() throws IOException {
		//파일의 컨텐츠에 연결 :  스트림 연결
		File file = new File("./data/Abc1115.csv");//파일을 가져오는 인스턴스
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
			
		}
		br.close();
		fr.close();
			
	}
	
}
