package hashset;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		
		/**
		 * set 타입의 collection은 순서의 구별이 없고 중복을 허용하지 않는다.
		 * 
		 */
		
		HashSet<Student> hashSet = new HashSet<Student>();

		hashSet.add(new Student("홍길동", 3));
		hashSet.add(new Student("이순신", 6));
		hashSet.add(new Student("장보고", 1));

		System.out.println(hashSet.toString());

		Student stduent = new Student("홍길동", 3);
		hashSet.remove(stduent);
		System.out.println(hashSet.toString());

	}

}
