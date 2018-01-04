package hashset;

public class Student {

	private String name;
	private int grade;

	public Student(String name, int grade) {
		// TODO 자동 생성된 생성자 스텁

		this.name = name;
		this.grade = grade;

	}

	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return name + ":" + grade;
	}

	@Override
	public int hashCode() {
		// TODO 자동 생성된 메소드 스텁
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO 자동 생성된 메소드 스텁
		String compareValue = obj.toString();
		String thisValue = toString();

		return thisValue.equals(compareValue);
	}

}
