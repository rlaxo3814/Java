package mc.sn.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1()호출코드 작성
		MapMain map= new MapMain();
				map.test1();
	}
	
	public void test1() {
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		//제너럴 사용할때 <>씀
		map.put("one", Integer.valueOf(1));
		map.put("two", 20);//map형식은 키값으로 가져온다(순서없음,중복이있다)
		map.put("three", 3);
		int size = map.size();
		System.out.println(size);
		Integer val = map.get("two");
		System.out.println(val);
		map.put("two",2);//20을 2로 고치는 것임
		val = map.get("two");
		System.out.println(val);
		val = map.remove("three");
		System.out.println(val);
		System.out.println(map.size());
		Set<String> keys = map.keySet();//Set은 순서가 있고 중복을 허락하지 않는다 그래서 set을 활용해서 정리
		Iterator<String> iter= keys.iterator();//키를 한줄로 세우시오 Iterator 클래스 활용
		while(iter.hasNext()){//iter.hasNext 다음 키 있어요 물어보는 것임
			String key = iter.next();//iter.next 다음 들어오세요~
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
