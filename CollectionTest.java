package mc.sn.day9;

import java.util.ArrayList;//ArrayList라는 클래스를 가져옴

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest ct = new CollectionTest();
		ct.test2();
	}

	public void test2() {
		ArrayList<Integer> list = new ArrayList<Integer>();//제너릭:<>안에 Integer를 넣는것
		list.add(10);//리스트 라는 컬렉션을 사용하는 과정
		list.add(20);
		list.set(1, 30);
		list.add(40);
		int size = list.size();
		System.out.println(size);
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			int val = list.get(i);// 상속관계가 성립
			System.out.println(val);
		}
		
	}
	public void test1() {
				// 컬렉션의 정의는 무엇입니까? 데이터를 집합으로 다룬다.
				// 하나의 변수로 여러개의 데이터를 CRUD한다.
				// 자바에서 컬렉션의 3가지 종류는 무엇입니까?
				// List,Set,Map
				// 3가지 종류를 설명하세요
				// 1.순서 2.중복
				// List: 순서있고, 중복있다 , index(순서)로 다룬다
				// Set: 순서없고, 중복없다, Iterator로 다룬다
				// Map: 순서없고, 중복있다,key(이름)로 다룬다
	}
	
}
