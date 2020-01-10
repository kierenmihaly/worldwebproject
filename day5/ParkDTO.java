package day5;
//��ü ���� ���α׷��� 5��Ģ

//SOLID
//S : Single responsibility -����å�ӿ�Ģ �̶�� �����ִ�.
//Ŭ������ �ϳ��� ���ϵȰ͸� ����� �ؾ��Ѵ�
//������ ���� ���α׷��� ����� �������� ��
//����� �ϴ� �κа� ui�� ����ϴ� �κ����ִµ�
//���κ��� ����ϴ� �κи� ����־�� �ϰ� ui�� ui����ϴ� �ڵ常 �־���Ѵ�.
//�� �ϳ��� Ŭ������ �ϳ��� ��ɸ� ��� �ؾ��Ѵ� 
//������ int�� �ð��� �޾Ҵµ� ���߿� �ٸ��ɷ� �ð��� �ްԵȴٸ� 
//�̷��� ��Ʈ�ѷ��ʿ��� ����� �ؾ��Ѵ� 
//
//O : Open-Closed
//L; Liskov
//I; Interface
//D;Dependency Injection

//���⼭ �����е��� ����ؾ� �Ұ���
//S�̴�. 
public class ParkDTO {

	// ���⼭ ����ؾ��Ұ���
	// S�̴�.
	// DTO�� Data Transfer Object�� ���Ӹ��ν�
	// �ʵ�� ����/����, equals, toString������ ���� �ȴ�.

	private String plateNumber;
	// �ڵ��� ��ȣ
	private int inTime;

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public boolean equals(Object o) {
		if (o instanceof ParkDTO) {
			ParkDTO p = (ParkDTO) o;
			if (plateNumber.equals(p.plateNumber))
				// �ڵ��� ��ȣ�� ������ !
				return true;
		}
		return false;
	}

}
