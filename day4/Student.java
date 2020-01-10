package day4;
//필드: 관리번호, 이름, 학년, 반, 국어, 영어, 수학점수
//메소드: 게터/세터, equals, toString, 총점계산, 평균계산
//단 총점계산과 평균계산은 메소드가 메시지를 출력하지 않고
//결과값을 return한다.
public class Student {

	private int id;
	private String stundentName;
	private int grade;
	private int room;
	private int korScore;
	private int engScore;
	private int matScore;
	
	public int getManageNumber() {
		return id;
	}
	public void setManageNumber(int id) {
		this.id = id;
	}
	public String getStundentName() {
		return stundentName;
	}
	public void setStundentName(String stundentName) {
		this.stundentName = stundentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getcLass() {
		return room;
	}
	public void setcLass(int room) {
		this.room = room;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMatScore() {
		return matScore;
	}
	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}	
	//위에 여기까지가 게터세터
	
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return id == s.id? true : false;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stundentName=" + stundentName + ", grade=" + grade + ", room=" + room
				+ ", korScore=" + korScore + ", engScore=" + engScore + ", matScore=" + matScore + "]";
	}
	//총점계산 아래부터
	public int calculateSum() {
		return korScore + engScore + matScore;
	}
	public double calcualteAverage() {
		return calculateSum() % 3.0;
		
	}
}
