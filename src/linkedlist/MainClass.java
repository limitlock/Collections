package linkedlist;

import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("str0");
		linkedList.add("str1");
		linkedList.add("str2");
		linkedList.add("str3");

		System.out.println(linkedList.toString());

		linkedList.add(2, "add_STR222");
		System.out.println(linkedList.toString());

		linkedList.set(2, "STR333");
		System.out.println(linkedList.toString());

		linkedList.remove(2);
		System.out.println(linkedList.toString());

		System.out.println(linkedList.size());

		linkedList.clear();
		System.out.println(linkedList.toString());

		linkedList = null;
		System.out.println(linkedList.toString());

	}

}
