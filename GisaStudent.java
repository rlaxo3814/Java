package mc.sn.gisa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GisaStudent {
	//문제 푸는 클래스
	private ArrayList<GisaScoreData> list;
	
	public GisaStudent(String filePath) {
		//list 구성
		list = new ArrayList<GisaScoreData>();
		//파일에 접속
		File file = new File(filePath);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				String[] temp = line.split(",");
				int sno = Integer.parseInt(temp[0].trim());
				int kor = Integer.parseInt(temp[2].trim());
				int eng = Integer.parseInt(temp[3].trim());
				int math = Integer.parseInt(temp[4].trim());
				int total = Integer.parseInt(temp[7].trim());
				String acc = temp[9];
				String local = temp[10];
				list.add(new GisaScoreData(sno,kor,eng,math,total,acc,local));	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//한라인씩 읽어서 인스턴스 만들고
		//인스턴스를 리스트에 저장
		
	}
	
	
	public String solveNo1() {
		String result = null;
		ArrayList<GisaScoreData> sortedList = new ArrayList<GisaScoreData>();
		for(GisaScoreData data : list) {
			if(data.getLocalCode().equals("B")) {
				sortedList.add(data);
			}
		}
		
		Collections.sort(sortedList, new ScoreComparator());
		
		for(int i=0;i<20;i++) {
			GisaScoreData temp = sortedList.get(i);
			System.out.println(temp.getSno()+": "+temp.calcuNo2());
		}
		result = String.valueOf(sortedList.get(4).getSno());
		return result;
	}
	
	public String solveNo2() {
		String result = null;
		//여러분이 풀어야 할 문제   
		int max = 0 ;
		for(GisaScoreData data : list) {
			if(data.getLocalCode().equals("B")) { // 지역코드가 B이면서
				if(max<data.calcuNo2()) {
					max = data.calcuNo2(); // 국어+영어 점수가 가장 큰 값을 구하고
				}
			}
		}
		result = String.valueOf(max); //리턴값 결정
		return result;
	}
	
	public String solveNo3() {
		String result = null;
		//영어+수학점수 >= 120 자료에 한하여 총점+점수포인트의 합계는
		int sum = 0;
		for(GisaScoreData data : list) {
			if(data.calcuNo3()>=120) {
				int point = 0;
				if(data.getAccCode().equals("A")) {
					point = 5;
				} else if(data.getAccCode().equals("B")) {
					point = 15;
				} else {
					point = 20;
				}
				sum = sum + data.getTotal()+point;
			}
		}
		result = String.valueOf(sum);
		return result;
	}
	
	public String solveNo4() {
		String result = null;
		int count = 0;
		for(GisaScoreData data : list) {
			if(data.getAccCode().equals("A")||data.getAccCode().equals("B")) {
				int point = 15;
				if(data.getLocalCode().equals("A")) {
					point = 5;
				} else if(data.getLocalCode().equals("B")) {
					point = 10;
				}
				if(data.getKor()+point>=50) {
					count++;
				}
			}
		}
		result = String.valueOf(count);
		
		return result;
	}
	
	
}
