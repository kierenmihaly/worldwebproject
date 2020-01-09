package day4;
//�ʵ�: ������ȣ, �̸�, �г�, ��, ����, ����, ��������
//�޼ҵ�: ����/����, equals, toString, �������, ��հ��
//�� �������� ��հ���� �޼ҵ尡 �޽����� ������� �ʰ�
//������� return�Ѵ�.
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
	//���� ��������� ���ͼ���
	
	
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
	//������� �Ʒ�����
	public int calculateSum() {
		return korScore + engScore + matScore;
	}
	public double calcualteAverage() {
		return calculateSum() % 3.0;
		
	}
}
