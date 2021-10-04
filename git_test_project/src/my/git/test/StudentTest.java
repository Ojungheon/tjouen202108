package my.git.test;

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student("하하", 40);
		System.out.println(st+"!!!!");
	}
}
//이클립스 워크스페이스에 있는 소스를 -> git의 워크트리폴더로 옮긴 것
//워크트리   ->   인덱스  ->  로컬저장소 -> 원격저장소
//    "add index"   "commit"      "push"